package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoRegistro;
import fatec.poo.control.DaoRecepcionista;
import fatec.poo.control.DaoHospede;
import fatec.poo.control.DaoQuarto;
import fatec.poo.model.Hospede;
import fatec.poo.model.Quarto;
import fatec.poo.model.Recepcionista;
import fatec.poo.model.Registro;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Jaquiel, Ravena, rayane
 */
public class GuiReservarLiberarQuarto extends javax.swing.JFrame {

    /**
     * Creates new form GuiReservarLiberarQuarto
     */
    public GuiReservarLiberarQuarto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        lblRegistroFuncional = new javax.swing.JLabel();
        lblCPFHospede = new javax.swing.JLabel();
        lblNumQuarto = new javax.swing.JLabel();
        lblDataEntrada = new javax.swing.JLabel();
        lblDataSaida = new javax.swing.JLabel();
        lblValorHospedagem = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtRegistroFuncional = new javax.swing.JTextField();
        txtNumQuarto = new javax.swing.JTextField();
        txtValorHospedagem = new javax.swing.JTextField();
        txtCPFHospede = new javax.swing.JFormattedTextField();
        txtDataEntrada = new javax.swing.JFormattedTextField();
        txtDataSaida = new javax.swing.JFormattedTextField();
        btnPesquisarRecepcionista = new javax.swing.JButton();
        btnPesquisarHospede = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnPesquisarQuarto = new javax.swing.JButton();
        txtNomeRecepcionista = new javax.swing.JTextField();
        txtNomeHospede = new javax.swing.JTextField();
        txtSituacaoQuarto = new javax.swing.JTextField();
        btnSair = new javax.swing.JButton();
        btnLiberar = new javax.swing.JButton();
        btnReservar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro Hospedagem");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblCodigo.setText("Código");

        lblRegistroFuncional.setText("Registro Funcional");

        lblCPFHospede.setText("CPF Hóspede");

        lblNumQuarto.setText("Nº. Quarto");

        lblDataEntrada.setText("Data entrada");

        lblDataSaida.setText("Data saída");

        lblValorHospedagem.setText("Valor Hospedagem");

        txtRegistroFuncional.setEnabled(false);

        txtNumQuarto.setToolTipText("");
        txtNumQuarto.setEnabled(false);

        txtValorHospedagem.setEnabled(false);

        try {
            txtCPFHospede.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPFHospede.setEnabled(false);

        try {
            txtDataEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataEntrada.setEnabled(false);

        try {
            txtDataSaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataSaida.setEnabled(false);

        btnPesquisarRecepcionista.setText("...");
        btnPesquisarRecepcionista.setEnabled(false);
        btnPesquisarRecepcionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarRecepcionistaActionPerformed(evt);
            }
        });

        btnPesquisarHospede.setText("...");
        btnPesquisarHospede.setEnabled(false);
        btnPesquisarHospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarHospedeActionPerformed(evt);
            }
        });

        jLabel1.setText("Situação");

        btnPesquisarQuarto.setText("...");
        btnPesquisarQuarto.setEnabled(false);
        btnPesquisarQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarQuartoActionPerformed(evt);
            }
        });

        txtNomeRecepcionista.setEnabled(false);

        txtNomeHospede.setEnabled(false);

        txtSituacaoQuarto.setEnabled(false);

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnLiberar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/rem.png"))); // NOI18N
        btnLiberar.setText("Liberar");
        btnLiberar.setEnabled(false);
        btnLiberar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLiberarActionPerformed(evt);
            }
        });

        btnReservar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnReservar.setText("Reservar");
        btnReservar.setEnabled(false);
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReservar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLiberar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDataSaida)
                                    .addComponent(lblValorHospedagem)
                                    .addComponent(lblDataEntrada))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtDataSaida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                    .addComponent(txtDataEntrada)
                                    .addComponent(txtValorHospedagem)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNumQuarto)
                                    .addComponent(lblCodigo)
                                    .addComponent(lblRegistroFuncional)
                                    .addComponent(lblCPFHospede))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodigo)
                                    .addComponent(txtRegistroFuncional)
                                    .addComponent(txtNumQuarto)
                                    .addComponent(txtCPFHospede, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPesquisarRecepcionista)
                                .addGap(18, 18, 18)
                                .addComponent(txtNomeRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPesquisarHospede)
                                .addGap(18, 18, 18)
                                .addComponent(txtNomeHospede))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(btnPesquisarQuarto)
                                .addGap(18, 18, 18)
                                .addComponent(txtSituacaoQuarto)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegistroFuncional)
                    .addComponent(txtRegistroFuncional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarRecepcionista)
                    .addComponent(txtNomeRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPFHospede)
                    .addComponent(txtCPFHospede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarHospede)
                    .addComponent(txtNomeHospede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumQuarto)
                    .addComponent(txtNumQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnPesquisarQuarto)
                    .addComponent(txtSituacaoQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataEntrada)
                    .addComponent(txtDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataSaida)
                    .addComponent(txtDataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorHospedagem)
                    .addComponent(txtValorHospedagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnLiberar)
                    .addComponent(btnReservar)
                    .addComponent(btnConsultar))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
                                    

    
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnLiberarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLiberarActionPerformed
        try {
            // Verificar se a data de saída é válida
            if (validarDataSaida(txtDataSaida.getText())) {
                LocalDate DataSaida = LocalDate.parse(txtDataSaida.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                registro.setDataSaida(DataSaida);
                Double valorTotal = registro.liberarQuarto();
                registro.setValorHospedagem(valorTotal);
                
                daoRegistro.liberar(registro);  
                
                Quarto quarto = daoQuarto.consultar(registro.getQuarto().getNumero());
                daoQuarto.alterarSituacao(quarto, "Livre");
                daoQuarto.alterarFaturaTotal(quarto);
                txtValorHospedagem.setText(Double.toString(valorTotal));
                 
                  txtCodigo.setEnabled(true);
                  txtCodigo.requestFocus();
                
                JOptionPane.showMessageDialog(null, "Quarto liberado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                ConfigurarInterfaceAposResgistroJaConcluido();
            } else {
                JOptionPane.showMessageDialog(null, "Data de saída inválida. Utilize o formato dd/MM/yyyy.", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite um valor numérico válido para o Código!", "Erro", JOptionPane.WARNING_MESSAGE);
            txtCodigo.setText("");
            txtCodigo.requestFocus();
        }
    }//GEN-LAST:event_btnLiberarActionPerformed

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        try {
            // Verificar se a data de entrada é válida
            if (validarDataEntrada(txtDataEntrada.getText())) {
                // Habilita a edição dos campos necessários
                habilitarCamposEdicao();

                // Desabilita o botão Consultar e o campo de código
                btnConsultar.setEnabled(false);
                txtCodigo.setEnabled(false);

                // Data:
                LocalDate DataEntrada = LocalDate.parse(txtDataEntrada.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                registro.setDataEntrada(DataEntrada);

                // Desabilita o botão Reservar
                btnReservar.setEnabled(false);
                daoRegistro.reservar(registro);

                // Atualiza o status do quarto
                Quarto quarto = daoQuarto.consultar(registro.getQuarto().getNumero());
                daoQuarto.alterarSituacao(quarto, "Ocupado");

                // Adiciona a mensagem de sucesso
                JOptionPane.showMessageDialog(null, "Quarto reservado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                ConfigurarInterfaceAposOperacao();
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Data de entrada inválida. Utilize o formato dd/MM/yyyy.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite um valor numérico válido para o Código!", "Erro", JOptionPane.WARNING_MESSAGE);
            txtCodigo.setText("");
            txtCodigo.requestFocus();
        }
    }//GEN-LAST:event_btnReservarActionPerformed
        
    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try {
            int codigo = Integer.parseInt(txtCodigo.getText());

            if (Registro.validarCodigoRegistro(String.valueOf(codigo))) {
                ResultSet registroResultSet = daoRegistro.consultar(codigo);

                if (registroResultSet == null) {
                    registro = new Registro(codigo, null, null);

                    // Habilitar campos
                    habilitarCamposEdicao();
                    btnPesquisarRecepcionista.setEnabled(true);
                    
                    // Habilitar Reservar
                    btnReservar.setEnabled(true);

                    // Desabilitar Consultar
                    btnConsultar.setEnabled(false);
                    txtCPFHospede.setEnabled(false);
                    txtNumQuarto.setEnabled(false);
                    txtDataEntrada.setEnabled(false);
                    txtDataSaida.setEnabled(false);
                } else {
                    LocalDate dataEntrada = registroResultSet.getDate("DATAENTRADA").toLocalDate();
                    
                    registro = new Registro(
                        codigo,
                        dataEntrada,
                        null
                    );
                    
                    Recepcionista recepcionista = daoRecepcionista.consultar(registroResultSet.getInt("REGFUNCRECEPCIONISTA"));
                    recepcionista.addRegistro(registro);
                    txtRegistroFuncional.setText(String.valueOf(recepcionista.getRegFunc()));
                    txtNomeRecepcionista.setText(recepcionista.getNome());
                    
                    Hospede hospede = daoHospede.consultar(registroResultSet.getString("CPFHOSPEDE"));
                    hospede.addRegistro(registro);
                    txtCPFHospede.setText(String.valueOf(hospede.getCpf()));
                    txtNomeHospede.setText(hospede.getNome());
                    
                    int numeroQuarto = registroResultSet.getInt("NUMEROQUARTO");
                    Quarto quarto = daoQuarto.consultar(numeroQuarto);
                    registro.setQuarto(quarto);
                    
                    txtNumQuarto.setText(String.valueOf(quarto.getNumero()));
                    txtSituacaoQuarto.setText(quarto.isSituacao() ? "Ocupado" : "Livre");

                    txtDataEntrada.setText(registro.getDataEntrada().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                    if(registroResultSet.getDate("DATASAIDA") == null){
                        ConfigurarInterfaceAposResgistroNaoConcluido();
                    }else{
                        LocalDate dataSaida = registroResultSet.getDate("DATASAIDA").toLocalDate();
                        registro.setDataSaida(dataSaida);
                        txtDataSaida.setText(registro.getDataSaida().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                        
                        registro.setValorHospedagem(registroResultSet.getDouble("VALORHOSPEDAGEM"));
                        txtValorHospedagem.setText(String.valueOf(registro.getValorHospedagem()));
                        
                        ConfigurarInterfaceAposResgistroJaConcluido();
                        JOptionPane.showMessageDialog(null, "Registro já concluido!", "Aviso", JOptionPane.WARNING_MESSAGE);
                    }
                }
                txtCodigo.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "Código inválido!", "Erro", JOptionPane.WARNING_MESSAGE);
                txtCodigo.setText("");
                txtCodigo.requestFocus();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite um valor numérico válido para o Código!", "Erro", JOptionPane.WARNING_MESSAGE);
            txtCodigo.setText("");
            txtCodigo.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(GuiReservarLiberarQuarto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed
     
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        conexao = new Conexao("C##JAQUIEL", "BD003048");//usuario e senha
        conexao.setDriver("oracle.jdbc.driver.OracleDriver"); //NA FATEC @apolo
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        daoRegistro = new DaoRegistro(conexao.conectar());
        daoRecepcionista = new DaoRecepcionista(conexao.conectar());
        daoQuarto = new DaoQuarto(conexao.conectar());
        daoHospede = new DaoHospede(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_formWindowClosed

    private void btnPesquisarRecepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarRecepcionistaActionPerformed
        try {
            String regFuncString = txtRegistroFuncional.getText();

            if (!regFuncString.isEmpty()) {
                int regFunc = Integer.parseInt(regFuncString);

                Recepcionista recepcionista = daoRecepcionista.consultar(regFunc);

                if (recepcionista != null) {
                    
                    registro.setRecepcionista(recepcionista);

                    txtNomeRecepcionista.setText(recepcionista.getNome());
                    txtRegistroFuncional.setEnabled(false);  // Desabilita a caixa de edição do registro funcional
                    btnPesquisarRecepcionista.setEnabled(false);
                    txtCPFHospede.setEnabled(true);
                    btnPesquisarHospede.setEnabled(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Recepcionista não cadastrado", "Aviso", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Digite um valor para o Registro Funcional!", "Aviso", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite um valor numérico válido para o Registro Funcional!", "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnPesquisarRecepcionistaActionPerformed

    private void btnPesquisarHospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarHospedeActionPerformed
        try {
            String cpf = txtCPFHospede.getText();

            if (!cpf.isEmpty()) {
                Hospede hospede = daoHospede.consultar(cpf);

                if (hospede != null) {
                    registro.setHospede(hospede);

                    txtNomeHospede.setText(hospede.getNome());
                    txtCPFHospede.setEnabled(false);
                    btnPesquisarHospede.setEnabled(false);
                    txtNumQuarto.setEnabled(true);
                    btnPesquisarQuarto.setEnabled(true);
                   
                } else {
                    JOptionPane.showMessageDialog(null, "Hóspede não cadastrado", "Aviso", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Digite um valor para o CPF do Hóspede!", "Aviso", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite um valor numérico válido para o CPF do Hóspede!", "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnPesquisarHospedeActionPerformed

    private void btnPesquisarQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarQuartoActionPerformed
        try {
            String numQuartoString = txtNumQuarto.getText();

            if (!numQuartoString.isEmpty()) {
                int numero = Integer.parseInt(numQuartoString);

                Quarto quarto = daoQuarto.consultar(numero);

                if (quarto != null) {
                    
                    registro.setQuarto(quarto);

                    if (!quarto.isSituacao()) {
                        txtSituacaoQuarto.setText("Livre");
                        txtNumQuarto.setEnabled(false);  
                        btnPesquisarQuarto.setEnabled(false);
                        
                        txtDataEntrada.setEnabled(true);
                        btnReservar.setEnabled(true);

                        txtDataEntrada.requestFocus();
                    } else {
                        JOptionPane.showMessageDialog(null, "Quarto Ocupado", "Aviso", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Quarto não cadastrado", "Aviso", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Digite um valor para o Número do Quarto!", "Aviso", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite um valor numérico válido para o Número do Quarto!", "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnPesquisarQuartoActionPerformed

    private boolean validarDataSaida(String dataSaida) {
        try {
            // Tenta fazer o parsing da data
            LocalDate.parse(dataSaida, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            return true;  // Se não lançar exceção, a data é válida
        } catch (DateTimeParseException e) {
            return false; // Se ocorrer exceção, a data é inválida
        }
    }
    
    private boolean validarDataEntrada(String dataEntrada) {
        try {
            LocalDate.parse(dataEntrada, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            
            return true;  
        } catch (DateTimeParseException e) {
            return false; 
        }
    }


    private void limparCampos() {
        txtCodigo.setText("");
        txtRegistroFuncional.setText("");
        txtCPFHospede.setText("");
        txtNumQuarto.setText("");
        txtDataEntrada.setText("");
        txtDataSaida.setText("");
        txtValorHospedagem.setText("");
        txtNomeRecepcionista.setText("");
        txtNomeHospede.setText("");
        txtSituacaoQuarto.setText("");
    }

    private void habilitarCamposEdicao() {
        txtRegistroFuncional.setEnabled(true);
        txtCPFHospede.setEnabled(true);
        txtNumQuarto.setEnabled(true);
        txtDataEntrada.setEnabled(true);
        txtDataSaida.setEnabled(true);
        txtValorHospedagem.setEnabled(false);
        txtNomeRecepcionista.setEnabled(false);
        txtNomeHospede.setEnabled(false);
        txtSituacaoQuarto.setEnabled(false);
    }

    private void ConfigurarInterfaceAposOperacao() {
        btnConsultar.setEnabled(true);
        btnLiberar.setEnabled(false);
        btnReservar.setEnabled(false);
        btnPesquisarRecepcionista.setEnabled(false);
        btnPesquisarHospede.setEnabled(false);
        btnPesquisarQuarto.setEnabled(false);
        txtCodigo.setEnabled(true);
        txtRegistroFuncional.setEnabled(false);
        txtCPFHospede.setEnabled(false);
        txtNumQuarto.setEnabled(false);
        txtDataEntrada.setEnabled(false);
        txtDataSaida.setEnabled(false);
        txtValorHospedagem.setEnabled(false);
        txtNomeRecepcionista.setEnabled(false);
        txtNomeHospede.setEnabled(false);
        txtSituacaoQuarto.setEnabled(false);
        txtCodigo.requestFocus();
    }
    
    private void ConfigurarInterfaceAposResgistroJaConcluido() {
        btnConsultar.setEnabled(false);
        btnLiberar.setEnabled(false);
        btnReservar.setEnabled(false);
        btnPesquisarRecepcionista.setEnabled(false);
        btnPesquisarHospede.setEnabled(false);
        btnPesquisarQuarto.setEnabled(false);
        txtCodigo.setEnabled(false);
        txtRegistroFuncional.setEnabled(false);
        txtCPFHospede.setEnabled(false);
        txtNumQuarto.setEnabled(false);
        txtDataEntrada.setEnabled(false);
        txtDataSaida.setEnabled(false);
        txtValorHospedagem.setEnabled(false);
        txtNomeRecepcionista.setEnabled(false);
        txtNomeHospede.setEnabled(false);
        txtSituacaoQuarto.setEnabled(false);
    }
    
    private void ConfigurarInterfaceAposResgistroNaoConcluido() {
        btnConsultar.setEnabled(false);
        btnLiberar.setEnabled(true);
        btnReservar.setEnabled(false);
        btnPesquisarRecepcionista.setEnabled(false);
        btnPesquisarHospede.setEnabled(false);
        btnPesquisarQuarto.setEnabled(false);
        txtCodigo.setEnabled(false);
        txtRegistroFuncional.setEnabled(false);
        txtCPFHospede.setEnabled(false);
        txtNumQuarto.setEnabled(false);
        txtDataEntrada.setEnabled(false);
        txtDataSaida.setEnabled(true);
        txtValorHospedagem.setEnabled(false);
        txtNomeRecepcionista.setEnabled(false);
        txtNomeHospede.setEnabled(false);
        txtSituacaoQuarto.setEnabled(false);
        txtDataSaida.requestFocus();
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnLiberar;
    private javax.swing.JButton btnPesquisarHospede;
    private javax.swing.JButton btnPesquisarQuarto;
    private javax.swing.JButton btnPesquisarRecepcionista;
    private javax.swing.JButton btnReservar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCPFHospede;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDataEntrada;
    private javax.swing.JLabel lblDataSaida;
    private javax.swing.JLabel lblNumQuarto;
    private javax.swing.JLabel lblRegistroFuncional;
    private javax.swing.JLabel lblValorHospedagem;
    private javax.swing.JFormattedTextField txtCPFHospede;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JFormattedTextField txtDataEntrada;
    private javax.swing.JFormattedTextField txtDataSaida;
    private javax.swing.JTextField txtNomeHospede;
    private javax.swing.JTextField txtNomeRecepcionista;
    private javax.swing.JTextField txtNumQuarto;
    private javax.swing.JTextField txtRegistroFuncional;
    private javax.swing.JTextField txtSituacaoQuarto;
    private javax.swing.JTextField txtValorHospedagem;
    // End of variables declaration//GEN-END:variables
    private DaoRegistro daoRegistro = null;
    private DaoRecepcionista daoRecepcionista = null;
    private DaoQuarto daoQuarto = null;
    private DaoHospede daoHospede = null;
    private Registro registro = null;
    private Conexao conexao = null;
}
