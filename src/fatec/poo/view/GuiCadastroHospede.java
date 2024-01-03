package fatec.poo.view;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import fatec.poo.control.Conexao;
import fatec.poo.control.DaoHospede;
import fatec.poo.model.Hospede;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

/**
 * 
 * @author Jaquiel, ravena, rayane
 */
public class GuiCadastroHospede extends javax.swing.JFrame {

    /**
     * Creates new form GuiCadastroHospede
     */
    public GuiCadastroHospede() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCPF = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        lblTaxaDesconto = new javax.swing.JLabel();
        txtTaxaDesconto = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        txtCPF = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Hóspede");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblCPF.setText("CPF");

        lblNome.setText("Nome");

        txtNome.setEnabled(false);

        txtEndereco.setEnabled(false);

        lblEndereco.setText("Endereço");

        lblTelefone.setText("Telefone");

        txtTelefone.setEnabled(false);

        lblTaxaDesconto.setText("Taxa de Desconto (%) ");

        txtTaxaDesconto.setEnabled(false);

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

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtCPF.setPreferredSize(new java.awt.Dimension(5, 19));

        jLabel1.setText("Idade");

        txtIdade.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 137, Short.MAX_VALUE)
                        .addComponent(btnConsultar)
                        .addGap(18, 18, 18)
                        .addComponent(btnInserir)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCPF)
                            .addComponent(lblNome)
                            .addComponent(lblTaxaDesconto)
                            .addComponent(lblEndereco)
                            .addComponent(lblTelefone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEndereco)
                            .addComponent(txtNome)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTaxaDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(34, 34, 34)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCPF)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEndereco))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTaxaDesconto)
                    .addComponent(txtTaxaDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addGap(30, 30, 30))
        );

        btnInserir.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String cpf = txtCPF.getText();
       // int idade = Integer.parseInt(txtIdade.getText());
        if (Hospede.validarCPF(cpf)) {
            hospede = null;
            hospede = daoHospede.consultar(cpf);

            if (hospede == null) {

                btnConsultar.setEnabled(false);
                btnInserir.setEnabled(true);
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);
            } else {

                // Configurar a interface gráfica para permitir a alteração
                habilitarCamposEdicao();
                txtNome.setText(hospede.getNome());
                txtTelefone.setText(hospede.getTelefone());
                txtEndereco.setText(hospede.getEndereco());
                txtTaxaDesconto.setText(Double.toString(hospede.getTaxaDesconto()));
                txtIdade.setText(String.valueOf(hospede.getIdade()));
                btnConsultar.setEnabled(false);
                btnInserir.setEnabled(false);
                btnAlterar.setEnabled(true);
                btnExcluir.setEnabled(true);
            }
            txtCPF.setEnabled(false);
            txtNome.setEnabled(true);
            txtIdade.requestFocus();
            txtEndereco.setEnabled(true);
            txtTelefone.setEnabled(true);
            txtTaxaDesconto.setEnabled(true);
            txtIdade.setEnabled(true);
            

        } else {
            JOptionPane.showMessageDialog(null, "CPF inválido!", "Erro", JOptionPane.WARNING_MESSAGE);
            txtCPF.setText("");
            txtCPF.requestFocus();
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
      
        String cpf = txtCPF.getText();
        String nome = txtNome.getText();
        String endereco = txtEndereco.getText();
        String telefone = txtTelefone.getText();
        String taxaDescontoStr = txtTaxaDesconto.getText();
        String idadeI =txtIdade.getText();
        

        int idade = Integer.parseInt(idadeI);

        double taxaDesconto = Double.parseDouble(taxaDescontoStr);

        hospede = new Hospede(cpf, nome);
        hospede.setEndereco(endereco);
        hospede.setTelefone(telefone);
        hospede.setTaxaDesconto(taxaDesconto);
        hospede.setIdade(idade);

        daoHospede.inserir(hospede);

        // Configurar a interface gráfica após a inserção
        limparCampos();
        configurarInterfaceAposInsercao();
        

    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?")== 0){
                int idade = Integer.parseInt(txtIdade.getText());
            try {
                hospede.setEndereco(txtEndereco.getText());
                hospede.setNome(txtNome.getText());
                hospede.setTelefone(txtTelefone.getText());
                hospede.setTaxaDesconto(extrairTaxaDesconto());
                hospede.setIdade(idade);
                daoHospede.alterar(hospede);
            } catch (SQLException ex) {
                Logger.getLogger(GuiCadastroHospede.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        limparCampos();
        configurarInterfaceAposOperacao();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        String cpf = txtCPF.getText();

       
        if (hospede != null) {
            btnConsultar.setEnabled(false);
            btnInserir.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
            txtCPF.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "Hóspede não encontrado.");
            txtCPF.requestFocus();
        }

        if (hospede != null) {
            daoHospede.excluir(hospede);
            // Limpar campos e configurar a interface gráfica
            limparCampos();
            configurarInterfaceAposOperacao();
        } else {
            JOptionPane.showMessageDialog(null, "Hóspede não encontrado.");
            txtCPF.requestFocus();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void limparCampos() {
        txtCPF.setText("");
        txtNome.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        txtTaxaDesconto.setText("");
        txtIdade.setText("");
    }

    private void habilitarCamposEdicao() {
        txtNome.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtTelefone.setEnabled(true);
        txtTaxaDesconto.setEnabled(true);
        txtIdade.setEnabled(true);
    }

    private void configurarInterfaceAposOperacao() {
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtCPF.setEnabled(true);
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtTaxaDesconto.setEnabled(false);
        txtIdade.setEnabled(false);
        txtCPF.requestFocus();
    }
    
    private void configurarInterfaceAposInsercao() {
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtCPF.setEnabled(true);
        txtCPF.requestFocus();
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtTaxaDesconto.setEnabled(false);
        txtIdade.setEnabled(false);
    }
   
    private double extrairTaxaDesconto(){
        String tcStr = txtTaxaDesconto.getText();

        // Se campo nao preenchido, taxa zero
        if (tcStr.length() == 0) return 0.0;

        tcStr = tcStr.replace(",", ".");
        return Double.parseDouble(tcStr) / 100;
    }

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
          conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_formWindowClosed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        conexao = new Conexao("C##JAQUIEL", "BD003048");//usuario e senha
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        daoHospede = new DaoHospede(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTaxaDesconto;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTaxaDesconto;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
    private DaoHospede daoHospede = null;
    private Hospede hospede = null;
    private Conexao conexao = null;
}
