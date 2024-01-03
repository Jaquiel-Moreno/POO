package fatec.poo.control;

import fatec.poo.model.Quarto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author raven, jaquiel, rayane
 */
public class DaoQuarto {

    private Connection conn;
    private DaoRegistro daoRegistro = null;

    public DaoQuarto(Connection conn) {
        this.conn = conn;
    }

    public Quarto consultar(int numero) {
        Quarto q = null;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM QUARTO WHERE NUMERO = ?");
            ps.setInt(1, numero);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                q = new Quarto(numero, rs.getString("TIPOQUARTO"), rs.getDouble("VALORDIARIA"));
                q.setValorDiaria(rs.getDouble("VALORDIARIA"));
                q.setSituacao("Ocupado".equals(rs.getString("SITUACAO")));
                q.setTotalFaturado(rs.getDouble("TOTALFATURADO"));
                
            }

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return q;
    }
      public Integer consultarFaturamento() {

        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT SUM(totalFaturado) as totalFaturado from Quarto");

            ResultSet rs = ps.executeQuery();

            if (rs.next() == true) {
                return rs.getInt("totalFaturado");
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return 0;
    }
   
    public void inserir(Quarto quarto) {
        PreparedStatement ps;

        try {
            ps = conn.prepareStatement("INSERT INTO QUARTO (NUMERO, VALORDIARIA, TIPOQUARTO, SITUACAO, TOTALFATURADO) VALUES (?, ?, ?, ?, ?)");

            ps.setInt(1, quarto.getNumero());
            ps.setDouble(2, quarto.getValorDiaria());
            if (quarto.getTipo().equals("Solteiro")) {
                ps.setString(3, "Solteiro");
            } else {
                ps.setString(3, "Casal");
            }
            ps.setString(4, "Livre");
            ps.setDouble(5, 0);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    public void alterar(Quarto quarto ) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE QUARTO SET VALORDIARIA = ?, TIPOQUARTO = ? WHERE NUMERO = ?");

            ps.setDouble(1, quarto.getValorDiaria());
            if (quarto.getTipo().equals("Solteiro")) {
                ps.setString(2, "Solteiro");
            } else {
                ps.setString(2, "Casal");
            }
            ps.setInt(3, quarto.getNumero());
         
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar quarto: " + ex.getMessage());
        }
    }

    public void excluir(Quarto quarto) {
        PreparedStatement ps;
        try {

            ps = conn.prepareStatement("DELETE FROM QUARTO WHERE NUMERO = ?"); // Correção no SQL

            ps.setInt(1, quarto.getNumero());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Quarto excluído com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    public void alterarSituacao(Quarto quarto, String situacao) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE QUARTO SET SITUACAO = ? WHERE NUMERO = ?");
            ps.setString(1, situacao);
            ps.setInt(2, quarto.getNumero());

            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar quarto: " + ex.getMessage());
        }
    }

    public void alterarFaturaTotal(Quarto quarto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE QUARTO SET TOTALFATURADO = ? WHERE NUMERO = ?");
            ps.setDouble(1, quarto.getTotalFaturado());
            ps.setInt(2, quarto.getNumero());

            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar quarto: " + ex.getMessage());
        }
    }
}
