package fatec.poo.control;

import fatec.poo.model.ServicoQuarto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author raven, jaquiel, rayane
 */
public class DaoServicoQuarto {
    private Connection conn;

    public DaoServicoQuarto(Connection conn) {
        this.conn = conn;
    }

    public ServicoQuarto consultar(int codigo) {
        ServicoQuarto sq = null;
        
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM SERVICOQUARTO WHERE CODIGO = ?");
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                sq = new ServicoQuarto(codigo, rs.getString("DESCRICAO"));
                sq.setValor(rs.getDouble("VALOR"));
                
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return sq;
    }

    public void inserir(ServicoQuarto servicoQuarto) {
        
         PreparedStatement ps;

        try {
            ps = conn.prepareStatement("INSERT INTO SERVICOQUARTO (CODIGO, DESCRICAO, VALOR) VALUES (?, ?, ?)");

            ps.setInt   (1, servicoQuarto.getCodigo());
            ps.setString(2, servicoQuarto.getDescricao());
            ps.setDouble(3, servicoQuarto.getValor());

            ps.execute();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
    
    public void alterar(ServicoQuarto servicoQuarto)  throws SQLException{
            PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE SERVICOQUARTO SET DESCRICAO = ?, VALOR = ? WHERE CODIGO = ?");

            ps.setString(1, servicoQuarto.getDescricao());
            ps.setDouble(2, servicoQuarto.getValor());
            ps.setInt(3, servicoQuarto.getCodigo());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Servico de quarto alterado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar Servico de quarto: " + ex.getMessage());
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

    
     public void excluir(ServicoQuarto servicoQuarto) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("DELETE FROM SERVICOQUARTO WHERE CODIGO = ?"); // Correção no SQL

            ps.setInt(1, servicoQuarto.getCodigo());

            ps.execute();
            JOptionPane.showMessageDialog(null, "Serviço de quarto excluído com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

}
