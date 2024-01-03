 package fatec.poo.control;
import fatec.poo.model.Hospede;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author raven, jaquiel, rayane
 */
public class DaoHospede {

    private Connection conn;

    public DaoHospede(Connection conn) {
        this.conn = conn;
    }

    public Hospede consultar(String cpf) {
        Hospede h = null;

        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("SELECT * FROM Hospede WHERE cpf = ?");

            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                h = new Hospede(cpf, rs.getString("nome"));
                h.setEndereco(rs.getString("endereco"));
                h.setTelefone(rs.getString("telefone"));
                h.setTaxaDesconto(rs.getDouble("taxaDesconto"));
                h.setIdade(rs.getInt("IDADE"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return h;
    }

    public void inserir(Hospede hospede) {
        
        PreparedStatement ps;

        try {

            ps = conn.prepareStatement("INSERT INTO Hospede (cpf, "
                    + "nome, "
                    + "endereco, "
                    + "telefone, "
                    + "taxadesconto,"
                    +"Idade)"
                    + "VALUES(?, ?, ?, ?, ?,?)");

            ps.setString(1, hospede.getCpf());
            ps.setString(2, hospede.getNome());
            ps.setString(3, hospede.getEndereco());
            ps.setString(4, hospede.getTelefone());
            ps.setDouble(5, hospede.getTaxaDesconto());
            ps.setInt   (6, hospede.getIdade());

            ps.execute();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
    
    public void alterar(Hospede hospede)throws SQLException{
        PreparedStatement ps = null;
    try {
        ps = conn.prepareStatement("UPDATE HOSPEDE SET NOME = ?, ENDERECO = ?, TELEFONE = ?, TAXADESCONTO = ?, IDADE = ? WHERE CPF = ?");

        ps.setString(1, hospede.getNome());
        ps.setString(2, hospede.getEndereco());
        ps.setString(3, hospede.getTelefone());
        ps.setDouble(4, hospede.getTaxaDesconto());
        ps.setInt (5,hospede.getIdade());
        ps.setString(6,hospede.getCpf());

        ps.executeUpdate();
      
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao alterar hóspede: " + ex.getMessage());
        throw ex;  // Re-lançar a exceção para que o chamador saiba que algo deu errado
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

    
     public void excluir(Hospede hospede) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("DELETE FROM Hospede WHERE cpf = ?"); // Correção no SQL

            ps.setString(1, hospede.getCpf());

            ps.execute();
            JOptionPane.showMessageDialog(null, "Hóspede excluído com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
}
