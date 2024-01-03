/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoQuarto;
import fatec.poo.control.DaoRegistro;
import fatec.poo.model.Quarto;
import fatec.poo.model.Registro;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 0030482123024
 */
public class GuiAvaliacao2 extends javax.swing.JFrame {

    /**
     * Creates new form GuiAvaliacao2
     */
    public GuiAvaliacao2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNumeroQuarto = new javax.swing.JLabel();
        txtNumeroQuarto = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        lblSituacao = new javax.swing.JLabel();
        txtSituacao = new javax.swing.JTextField();
        lblTotalFaturado = new javax.swing.JLabel();
        txtTotalFaturado = new javax.swing.JTextField();
        btnPesquisa = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblNumeroQuarto.setText("Numero do Quarto");

        lblTipo.setText("Tipo");

        txtTipo.setEnabled(false);

        lblSituacao.setText("Situação ");

        txtSituacao.setEnabled(false);

        lblTotalFaturado.setText("Total Faturado");

        txtTotalFaturado.setEnabled(false);

        btnPesquisa.setIcon(new javax.swing.ImageIcon("G:\\POO_FINAL_DP\\prjPOOJaquielRavenaRayane\\src\\fatec\\poo\\view\\icon\\pesq.png")); // NOI18N
        btnPesquisa.setText("Pesquisa");
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(255, 0, 51));
        btnSair.setIcon(new javax.swing.ImageIcon("G:\\POO_FINAL_DP\\prjPOOJaquielRavenaRayane\\src\\fatec\\poo\\view\\icon\\exit.png")); // NOI18N
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(lblNumeroQuarto)
                                .addGap(61, 61, 61)
                                .addComponent(txtNumeroQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTipo)
                                    .addComponent(lblSituacao)
                                    .addComponent(lblTotalFaturado))))
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtSituacao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(txtTipo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotalFaturado)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(btnPesquisa)
                        .addGap(68, 68, 68)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroQuarto)
                    .addComponent(txtNumeroQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipo)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSituacao)
                    .addComponent(txtSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTotalFaturado)
                    .addComponent(txtTotalFaturado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisa)
                    .addComponent(btnSair))
                .addGap(58, 58, 58))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
      
        
        try {

            int numeroQuarto = Integer.parseInt(txtNumeroQuarto.getText());
            DecimalFormat df = new DecimalFormat("###,##0.00");
          
            quarto = null;
            quarto = daoQuarto.consultar(numeroQuarto);
            if (quarto == null) {//não encontrou o objeto na BD
                JOptionPane.showMessageDialog(this, "Quarto não cadastrado", "INFORMAÇÃO", JOptionPane.INFORMATION_MESSAGE);

                //Reposicionar o foco na aixa de edição do Número de Quarto
                txtNumeroQuarto.setText("");
                txtNumeroQuarto.requestFocus();
            } else { //encontrou o objeto na BD
                String situacao;
                if (quarto.getTipo().equals("Solteiro")) {
                    txtTipo.setText("Solteiro");
                } else {
                    txtTipo.setText("Casal");
                }
                if (quarto.isSituacao()) {
                    situacao = "Ocupado";
                } else {
                    situacao = "Liberado";
                }
                txtSituacao.setText(situacao);
                
                 
                // txtTotalFaturado.setText(Double.toString(registro.getValorHospedagem()));
                

            }
            ResultSet registroDaoResult = daoRegistro.consultarTotalFaturado(WIDTH);
            try {
                // DaoRegistro registro = new DaoRegistro();
                txtTotalFaturado.setText(Double.toString(registroDaoResult.getDouble("ValorHospedagem")));
                //txtTotalFaturado.setText(Double.toString(quarto.liberar(SOMEBITS)));
            } catch (SQLException ex) {
                Logger.getLogger(GuiAvaliacao2.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NumberFormatException ex) {
            //Se o número do quarto não for um valor númerico inteiro, exibir mensagem de advêrtencia.
            JOptionPane.showMessageDialog(this, "Número de Quarto Inválido", "Advertência", JOptionPane.WARNING_MESSAGE);

            //Reposicionar o foco na aixa de edição do Número de Quarto
            txtNumeroQuarto.setText("");
            txtNumeroQuarto.requestFocus();
//       txtTotalFaturado.setText(Double.toString(registro.getValorHospedagem()));

    }//GEN-LAST:event_btnPesquisaActionPerformed

    }
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_formWindowClosed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        // TODO add your handling code here:
        conexao = new Conexao("C##JAQUIEL", "BD003048");//usuario e senha
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        daoRegistro = new DaoRegistro(conexao.conectar());
        daoQuarto = new DaoQuarto(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void limparCampos() {
        txtNumeroQuarto.setText("");
        txtTipo.setText("");
        txtSituacao.setText("");
        txtTotalFaturado.setText("");

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblNumeroQuarto;
    private javax.swing.JLabel lblSituacao;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTotalFaturado;
    private javax.swing.JTextField txtNumeroQuarto;
    private javax.swing.JTextField txtSituacao;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtTotalFaturado;
    // End of variables declaration//GEN-END:variables
 private DaoQuarto daoQuarto = null;
    private Quarto quarto = null;
    private Conexao conexao = null;
    private DaoRegistro daoRegistro = null;
    private Registro registro = null;
}
