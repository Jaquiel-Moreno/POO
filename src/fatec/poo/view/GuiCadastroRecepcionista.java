package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoRecepcionista;
import fatec.poo.model.Recepcionista;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jaquiel, ravena, rayane
 */
public class GuiCadastroRecepcionista extends javax.swing.JFrame {

    public GuiCadastroRecepcionista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblRegistroFuncional = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        txtRegistroFuncional = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        pnlTurno = new javax.swing.JPanel();
        rdbManha = new javax.swing.JRadioButton();
        rdbTarde = new javax.swing.JRadioButton();
        rdbNoite = new javax.swing.JRadioButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Recepcionista");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblRegistroFuncional.setText("Registro Funcional");

        lblNome.setText("Nome");

        lblEndereco.setText("Endereço");

        lblTelefone.setText("Telefone");

        txtNome.setEnabled(false);

        txtEndereco.setEnabled(false);

        txtTelefone.setEnabled(false);

        pnlTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Turno"));

        buttonGroup1.add(rdbManha);
        rdbManha.setSelected(true);
        rdbManha.setText("Manha");
        rdbManha.setEnabled(false);
        rdbManha.setNextFocusableComponent(rdbTarde);

        buttonGroup1.add(rdbTarde);
        rdbTarde.setText("Tarde");
        rdbTarde.setEnabled(false);
        rdbTarde.setNextFocusableComponent(rdbNoite);

        buttonGroup1.add(rdbNoite);
        rdbNoite.setText("Noite");
        rdbNoite.setEnabled(false);
        rdbNoite.setNextFocusableComponent(rdbManha);

        javax.swing.GroupLayout pnlTurnoLayout = new javax.swing.GroupLayout(pnlTurno);
        pnlTurno.setLayout(pnlTurnoLayout);
        pnlTurnoLayout.setHorizontalGroup(
            pnlTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTurnoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbManha)
                .addGap(18, 18, 18)
                .addComponent(rdbTarde)
                .addGap(26, 26, 26)
                .addComponent(rdbNoite)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTurnoLayout.setVerticalGroup(
            pnlTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTurnoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbManha)
                    .addComponent(rdbTarde)
                    .addComponent(rdbNoite))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        rdbManha.getAccessibleContext().setAccessibleDescription("Manha");
        rdbTarde.getAccessibleContext().setAccessibleDescription("Tarde");
        rdbNoite.getAccessibleContext().setAccessibleDescription("Noite");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(lblEndereco)
                            .addComponent(lblRegistroFuncional)
                            .addComponent(lblTelefone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRegistroFuncional, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                            .addComponent(txtEndereco))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegistroFuncional)
                    .addComponent(txtRegistroFuncional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addGap(48, 48, 48))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Integer.parseInt(txtRegistroFuncional.getText());
       
        if (recepcionista != null) {
            int resposta = JOptionPane.showConfirmDialog(null, "Confirma Exclusão?", "Exclusão", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                btnConsultar.setEnabled(false);
                btnInserir.setEnabled(false);
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);
                txtRegistroFuncional.setEnabled(false);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Recepcionista não encontrado.");
            txtRegistroFuncional.requestFocus();
        }

        if (recepcionista != null) {
            daoRecepcionista.excluir(recepcionista);
            // Limpar campos e configurar a interface gráfica
            limparCampos();
            configurarInterfaceAposOperacao();
        } else {
            JOptionPane.showMessageDialog(null, "Recepcionista não encontrado.");
            txtRegistroFuncional.requestFocus();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
         try {
            int regFunc = Integer.parseInt(txtRegistroFuncional.getText());

            if (Recepcionista.validarRegFunc(String.valueOf(regFunc))) {
                recepcionista = daoRecepcionista.consultar(regFunc);

                if (recepcionista == null) {
                    btnConsultar.setEnabled(false);
                    btnInserir.setEnabled(true);
                    btnAlterar.setEnabled(false);
                    btnExcluir.setEnabled(false);
                    habilitarCamposEdicao();
                } else {
                    // Preencher os campos com as informações recuperadas
                    txtNome.setText(recepcionista.getNome());
                    txtTelefone.setText(recepcionista.getTelefone());
                    txtEndereco.setText(recepcionista.getEndereco());

                    // Definir o turno selecionado com base nas informações recuperadas
                    String turno = recepcionista.getTurno();

                    if ("Manha".equals(turno)) {
                        rdbManha.setSelected(true);
                    } else if ("Tarde".equals(turno)) {
                        rdbTarde.setSelected(true);
                    } else if ("Noite".equals(turno)) {
                        rdbNoite.setSelected(true);
                    }


                // Habilitar/desabilitar botões conforme necessário
                habilitarCamposEdicao();
                btnConsultar.setEnabled(false);
                btnInserir.setEnabled(false);
                btnAlterar.setEnabled(true);
                btnExcluir.setEnabled(true);
                }
                txtRegistroFuncional.setEnabled(false);
                txtNome.setEnabled(true);
                txtNome.requestFocus();
                txtEndereco.setEnabled(true);
                txtTelefone.setEnabled(true);
                rdbManha.setSelected(false);//Alterado para false
                rdbTarde.setSelected(false);//Alterado para false
                rdbNoite.setSelected(false);//Alterado para false
            } else {
                JOptionPane.showMessageDialog(null, "Registro funcional inválido!", "Erro", JOptionPane.WARNING_MESSAGE);
                txtRegistroFuncional.setText("");
                txtRegistroFuncional.requestFocus();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite um valor numérico válido para o Registro Funcional!", "Erro", JOptionPane.WARNING_MESSAGE);
            txtRegistroFuncional.setText("");
            txtRegistroFuncional.requestFocus();
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        try {
            int regFunc = Integer.parseInt(txtRegistroFuncional.getText());
            String nome = txtNome.getText();
            String endereco = txtEndereco.getText();
            String telefone = txtTelefone.getText();
            String turno = inserirTurnoSelecionado();

            recepcionista = new Recepcionista(regFunc, nome);
            recepcionista.setEndereco(endereco);
            recepcionista.setTelefone(telefone);
            recepcionista.setTurno(turno);

            daoRecepcionista.inserir(recepcionista);

            limparCampos();
            configurarInterfaceAposInsercao();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Formato inválido para número", "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?") == 0) {
            try {
                recepcionista.setEndereco(txtEndereco.getText());
                recepcionista.setNome(txtNome.getText());
                recepcionista.setTelefone(txtTelefone.getText());
                recepcionista.setTurno(inserirTurnoSelecionado()); // Certifique-se de atribuir o valor aqui
                daoRecepcionista.alterar(recepcionista);
            } catch (SQLException ex) {
                Logger.getLogger(GuiCadastroHospede.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        limparCampos();
        configurarInterfaceAposOperacao();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        conexao = new Conexao("C##JAQUIEL", "BD003048");//usuario e senha
        conexao.setDriver("oracle.jdbc.driver.OracleDriver"); //@apolo na fatec
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        daoRecepcionista = new DaoRecepcionista(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_formWindowClosed

    private void limparCampos() {
        txtRegistroFuncional.setText("");
        txtNome.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
    }

    private void habilitarCamposEdicao() {
        txtNome.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtTelefone.setEnabled(true);
        rdbManha.setEnabled(true);
        rdbTarde.setEnabled(true);
        rdbNoite.setEnabled(true);
        
    }

    private void configurarInterfaceAposOperacao() {
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtRegistroFuncional.setEnabled(true);
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        rdbManha.setEnabled(false);
        rdbTarde.setEnabled(false);
        rdbNoite.setEnabled(false);
        txtRegistroFuncional.requestFocus();
    }
    
    private void configurarInterfaceAposInsercao() {
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtRegistroFuncional.setEnabled(true);
        txtRegistroFuncional.requestFocus();
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        rdbManha.setEnabled(false);
        rdbTarde.setEnabled(false);
        rdbNoite.setEnabled(false);
    }
           
    private String inserirTurnoSelecionado() {
        if (rdbManha.isSelected()) {
            return "Manha";
        } else if (rdbTarde.isSelected()) {
            return "Tarde";
        } else if (rdbNoite.isSelected()) {
            return "Noite";
        } else {
            System.out.println("Erro no turno");
            return null;
        }
    }
    
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRegistroFuncional;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JPanel pnlTurno;
    private javax.swing.JRadioButton rdbManha;
    private javax.swing.JRadioButton rdbNoite;
    private javax.swing.JRadioButton rdbTarde;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRegistroFuncional;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
    private DaoRecepcionista daoRecepcionista = null;
    private Recepcionista recepcionista = null;
    private Conexao conexao = null;
}
