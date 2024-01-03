
package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoQuarto;
import fatec.poo.model.Quarto;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jaquiel,ravena, rayane
 */
public class GuiCadastroQuarto extends javax.swing.JFrame {


    public GuiCadastroQuarto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblNumQuarto = new javax.swing.JLabel();
        lblValDiaria = new javax.swing.JLabel();
        txtNumQuarto = new javax.swing.JTextField();
        txtValorDiaria = new javax.swing.JTextField();
        pnlTipoQuarto = new javax.swing.JPanel();
        rdbSolteiro = new javax.swing.JRadioButton();
        rdbCasal = new javax.swing.JRadioButton();
        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Quarto");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblNumQuarto.setText("N° Quarto");

        lblValDiaria.setText("Valor Diaria");

        txtValorDiaria.setEnabled(false);

        pnlTipoQuarto.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo"));

        buttonGroup1.add(rdbSolteiro);
        rdbSolteiro.setSelected(true);
        rdbSolteiro.setText("Solteiro");
        rdbSolteiro.setEnabled(false);

        buttonGroup1.add(rdbCasal);
        rdbCasal.setText("Casal");
        rdbCasal.setEnabled(false);

        javax.swing.GroupLayout pnlTipoQuartoLayout = new javax.swing.GroupLayout(pnlTipoQuarto);
        pnlTipoQuarto.setLayout(pnlTipoQuartoLayout);
        pnlTipoQuartoLayout.setHorizontalGroup(
            pnlTipoQuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTipoQuartoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbSolteiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(rdbCasal)
                .addContainerGap())
        );
        pnlTipoQuartoLayout.setVerticalGroup(
            pnlTipoQuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTipoQuartoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlTipoQuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbSolteiro)
                    .addComponent(rdbCasal))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultar)
                        .addGap(18, 18, 18)
                        .addComponent(btnInserir)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pnlTipoQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblValDiaria)
                                .addComponent(lblNumQuarto))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtValorDiaria)
                                .addComponent(txtNumQuarto)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumQuarto)
                    .addComponent(txtNumQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValDiaria)
                    .addComponent(txtValorDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(pnlTipoQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
          try {
            int numero = Integer.parseInt(txtNumQuarto.getText());

            if (Quarto.validarNumeroQuarto(String.valueOf(numero))) {
                quarto = daoQuarto.consultar(numero);
                
                if (quarto == null) {

                    btnConsultar.setEnabled(false);
                    btnInserir.setEnabled(true);
                    btnAlterar.setEnabled(false);
                    btnExcluir.setEnabled(false);
                    habilitarCamposEdicao();
                } else {
                    // Preencher os campos com as informações recuperadas
                    txtValorDiaria.setText(Double.toString(quarto.getValorDiaria()));
                    
                    

                    // Definir o turno selecionado com base nas informações recuperadas
                    String tipo = quarto.getTipo();

                    if ("Solteiro".equals(tipo)) {
                        rdbSolteiro.setSelected(true);
                        rdbCasal.setSelected(false);
                    } else if ("Casal".equals(tipo)) {
                        rdbCasal.setSelected(true);
                        rdbSolteiro.setSelected(false); 
                    }                        

                    // Habilitar/desabilitar botões conforme necessário
                    habilitarCamposEdicao();
                    btnConsultar.setEnabled(false);
                    btnInserir.setEnabled(false);
                    btnAlterar.setEnabled(true);
                    btnExcluir.setEnabled(true);
                }
                txtNumQuarto.setEnabled(false);
                txtValorDiaria.setEnabled(true);
                rdbSolteiro.setSelected(false);//alterado para false
                rdbCasal.setSelected(false);//alterada para false
            } else {
                JOptionPane.showMessageDialog(null, "Numero do quarto inválido!", "Erro", JOptionPane.WARNING_MESSAGE);
                txtNumQuarto.setText("");
                txtNumQuarto.requestFocus();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite um valor numérico válido para o Numero do quarto!", "Erro", JOptionPane.WARNING_MESSAGE);
            txtNumQuarto.setText("");
            txtNumQuarto.requestFocus();
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        try {
            int numero = Integer.parseInt(txtNumQuarto.getText());
            double valorDiaria = Double.parseDouble(txtValorDiaria.getText());
            String tipo = inserirTipoSelecionado();

            quarto = new Quarto(numero, tipo, valorDiaria);

            daoQuarto.inserir(quarto);

            limparCampos();
            configurarInterfaceAposInsercao();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Formato inválido para número", "Erro", JOptionPane.WARNING_MESSAGE);
        }      
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?")== 0){
            quarto.setValorDiaria(Double.parseDouble(txtValorDiaria.getText()));
            String tipo = inserirTipoSelecionado();
            quarto.setTipo(tipo);
            daoQuarto.alterar(quarto);
        }
        limparCampos();
        configurarInterfaceAposOperacao();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Integer.parseInt(txtNumQuarto.getText());
       
        if (quarto != null) {
            int resposta = JOptionPane.showConfirmDialog(null, "Confirma Exclusão?", "Exclusão", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                btnConsultar.setEnabled(false);
                btnInserir.setEnabled(false);
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);
                txtNumQuarto.setEnabled(false);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Quarto não encontrado.");
            txtNumQuarto.requestFocus();
        }

        if (quarto != null) {
            daoQuarto.excluir(quarto);
            // Limpar campos e configurar a interface gráfica
            limparCampos();
            configurarInterfaceAposOperacao();
        } else {
            JOptionPane.showMessageDialog(null, "Quarto não encontrado.");
            txtNumQuarto.requestFocus();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
         dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        conexao = new Conexao("C##JAQUIEL", "BD003048");//usuario e senha
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        daoQuarto = new DaoQuarto(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
         conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_formWindowClosed

    
    private void limparCampos() {
        txtNumQuarto.setText("");
        txtValorDiaria.setText("");
        rdbSolteiro.setSelected(true);
        rdbCasal.setSelected(false);
    }

    private void habilitarCamposEdicao() {
        txtValorDiaria.setEnabled(true);
        rdbSolteiro.setEnabled(true);
        rdbCasal.setEnabled(true);
    }

    private void configurarInterfaceAposOperacao() {
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtNumQuarto.setEnabled(true);
        txtValorDiaria.setEnabled(false);
        rdbSolteiro.setEnabled(false);
        rdbCasal.setEnabled(false);
        txtNumQuarto.requestFocus();
    }
    
    private void configurarInterfaceAposInsercao() {
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtNumQuarto.setEnabled(true);
        txtNumQuarto.requestFocus();
        txtValorDiaria.setEnabled(false);
        rdbSolteiro.setEnabled(false);
        rdbCasal.setEnabled(false);
    }
    
    private String inserirTipoSelecionado() {
        if (rdbSolteiro.isSelected()) {
            return "Solteiro";
        } else {
            return "Casal";
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lblNumQuarto;
    private javax.swing.JLabel lblValDiaria;
    private javax.swing.JPanel pnlTipoQuarto;
    private javax.swing.JRadioButton rdbCasal;
    private javax.swing.JRadioButton rdbSolteiro;
    private javax.swing.JTextField txtNumQuarto;
    private javax.swing.JTextField txtValorDiaria;
    // End of variables declaration//GEN-END:variables
    private DaoQuarto daoQuarto = null;
    private Quarto quarto = null;
    private Conexao conexao = null;
}
