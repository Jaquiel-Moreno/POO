package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoServicoQuarto;
import fatec.poo.model.ServicoQuarto;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jaquiel, Ravena, rayane
 */
public class GuiServicoQuarto extends javax.swing.JFrame {

    public GuiServicoQuarto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        cboDescricao = new javax.swing.JComboBox<>();
        txtValor = new javax.swing.JTextField();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Serviço de Quarto");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblCodigo.setText("Código");

        lblDescricao.setText("Descrição");

        lblValor.setText("Valor");

        cboDescricao.setEditable(true);
        cboDescricao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Água", "Doce", "Lanche", "Refrigerante", "Salgado" }));
        cboDescricao.setEnabled(false);

        txtValor.setEnabled(false);

        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.setEnabled(false);
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/rem.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescricao)
                            .addComponent(lblValor)
                            .addComponent(lblCodigo))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cboDescricao, javax.swing.GroupLayout.Alignment.LEADING, 0, 137, Short.MAX_VALUE)
                            .addComponent(txtValor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricao)
                    .addComponent(cboDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addGap(55, 55, 55))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try {
            int codigo = Integer.parseInt(txtCodigo.getText());        

            if (ServicoQuarto.validarCodigoQuarto(String.valueOf(codigo))) {
                servicoQuarto = daoServicoQuarto.consultar(codigo);
                
                if (servicoQuarto == null) {

                    btnConsultar.setEnabled(false);
                    btnInserir.setEnabled(true);
                    btnAlterar.setEnabled(false);
                    btnExcluir.setEnabled(false);
                    cboDescricao.setEnabled(false); 
                    txtValor.setEnabled(false);
                    
                    habilitarCamposEdicao();
                } else {
                    // Preencher os campos com as informações recuperadas
                   txtValor.setText(Double.toString(servicoQuarto.getValor()));
                    cboDescricao.setSelectedItem(servicoQuarto.getDescricao());
                    
                    // Habilitar/desabilitar botões conforme necessário
                    habilitarCamposEdicao();
                    btnConsultar.setEnabled(false);
                    btnInserir.setEnabled(false);
                    btnAlterar.setEnabled(true);
                    btnExcluir.setEnabled(true);
                
                   cboDescricao.setEnabled(true);
                }
                txtCodigo.setEnabled(false);
                txtValor.setEnabled(true);
                cboDescricao.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "Código inválido!", "Erro", JOptionPane.WARNING_MESSAGE);
                txtCodigo.setText("");
                txtCodigo.requestFocus();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite um valor numérico válido para o Código!", "Erro", JOptionPane.WARNING_MESSAGE);
            txtCodigo.setText("");
            txtCodigo.requestFocus();
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
          try {
            int codigo = Integer.parseInt(txtCodigo.getText());
            double valor = Double.parseDouble(txtValor.getText());
            String descricao = cboDescricao.getSelectedItem().toString();

            servicoQuarto = new ServicoQuarto(codigo, descricao);
            servicoQuarto.setValor(valor); 

            daoServicoQuarto.inserir(servicoQuarto);

            limparCampos();
            configurarInterfaceAposInsercao();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Formato inválido para código ou valor", "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?") == 0) {
            try {
                servicoQuarto.setValor(Double.parseDouble(txtValor.getText()));
                servicoQuarto.setDescricao(cboDescricao.getSelectedItem().toString());

                daoServicoQuarto.alterar(servicoQuarto);
            } catch (SQLException ex) {
                Logger.getLogger(GuiCadastroHospede.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        limparCampos();
        configurarInterfaceAposOperacao();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Integer.parseInt(txtCodigo.getText());
       
        if (servicoQuarto != null) {
            int resposta = JOptionPane.showConfirmDialog(null, "Confirma Exclusão?", "Exclusão", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                btnConsultar.setEnabled(false);
                btnInserir.setEnabled(false);
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(true);
                txtCodigo.setEnabled(false);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Serviço de quarto não encontrado.");
            txtCodigo.requestFocus();
        }

        if (servicoQuarto != null) {
            daoServicoQuarto.excluir(servicoQuarto);
            // Limpar campos e configurar a interface gráfica
            limparCampos();
            configurarInterfaceAposOperacao();
        } else {
            JOptionPane.showMessageDialog(null, "Serviço de quarto não encontrado.");
            txtCodigo.requestFocus();
        }
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("C##JAQUIEL", "BD003048");//usuario e senha
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        daoServicoQuarto = new DaoServicoQuarto(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_formWindowClosed

    
        private void limparCampos() {
        txtCodigo.setText("");
        cboDescricao.setSelectedIndex(0);
        txtValor.setText("");
   
    }

    private void habilitarCamposEdicao() {
        txtCodigo.setEnabled(true);
        cboDescricao.setEnabled(true);
        txtValor.setEnabled(true);
    }

    private void configurarInterfaceAposOperacao() {
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtCodigo.setEnabled(true);
        cboDescricao.setEnabled(false);
        txtValor.setEnabled(false);
       
        txtCodigo.requestFocus();
    }
    
    private void configurarInterfaceAposInsercao() {
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtCodigo.setEnabled(true);
        txtCodigo.requestFocus();
        cboDescricao.setEnabled(false);
        txtValor.setEnabled(false);
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cboDescricao;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
    private DaoServicoQuarto daoServicoQuarto = null;
    private ServicoQuarto servicoQuarto = null;
    private Conexao conexao = null;
}
