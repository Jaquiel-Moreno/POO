package fatec.poo.control;

import fatec.poo.model.Recepcionista;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author raven, jaquiel, rayane
 */
public class DaoRecepcionista {
    private Connection conn;

    public DaoRecepcionista(Connection conn) {
        this.conn = conn;
    }

    public Recepcionista consultar(int regFunc) {
        Recepcionista r = null;

        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM Recepcionista WHERE REGFUNC = ?");

            ps.setInt(1,regFunc);
            ResultSet rs = ps.executeQuery();

            if (rs.next() == true) {
                r = new Recepcionista(regFunc, rs.getString("nome"));
                r.setEndereco(rs.getString("endereco"));
                r.setTelefone(rs.getString("telefone"));
               
                if ("Manha".equals(rs.getString("turno"))) {
                    r.setTurno("Manha");
                } else if("Tarde".equals(rs.getString("turno"))) {
                    r.setTurno("Tarde");
                } else if("Noite".equals(rs.getString("turno"))) {
                    r.setTurno("Noite");
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return r;
    }

    public void inserir(Recepcionista recepcionista) {
        
        PreparedStatement ps;

        try {

            ps = conn.prepareStatement("INSERT INTO Recepcionista (REGFUNC, "
                    + "nome, "
                    + "endereco, "
                    + "telefone, "
                    + "turno)"
                    + "VALUES(?, ?, ?, ?, ?)");

            ps.setInt   (1, recepcionista.getRegFunc());
            ps.setString(2, recepcionista.getNome());
            ps.setString(3, recepcionista.getEndereco());
            ps.setString(4, recepcionista.getTelefone());
            if (recepcionista.getTurno().equals("Manha")) {
                ps.setString(5, "Manha");
            } else if (recepcionista.getTurno().equals("Tarde")) {
                ps.setString(5, "Tarde");
            } else if (recepcionista.getTurno().equals("Noite")) {
                ps.setString(5, "Noite");
            }
            ps.execute();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
    
    public void alterar(Recepcionista recepcionista)  throws SQLException{
            PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE Recepcionista SET NOME = ?, ENDERECO = ?,TELEFONE = ?, TURNO = ? WHERE REGFUNC = ?");

            ps.setString(1, recepcionista.getNome());
            ps.setString(2, recepcionista.getEndereco());
            ps.setString(3, recepcionista.getTelefone());
            if (recepcionista.getTurno().equals("Manha")) {
                ps.setString(4, "Manha");
            } else if (recepcionista.getTurno().equals("Tarde")) {
                ps.setString(4, "Tarde");
            } else if (recepcionista.getTurno().equals("Noite")) {
                ps.setString(4, "Noite");
            }
            ps.setInt(5, recepcionista.getRegFunc());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Recepcionista alterado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar Recepcionista: " + ex.getMessage());
            throw ex; 
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    
     public void excluir(Recepcionista recepcionista) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("DELETE FROM Recepcionista WHERE REGFUNC = ?"); // Correção no SQL

            ps.setInt(1, recepcionista.getRegFunc());

            ps.execute();
            JOptionPane.showMessageDialog(null, "Recepcionista excluído com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
}
