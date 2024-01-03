package fatec.poo.control;

import fatec.poo.model.Hospede;
import fatec.poo.model.Quarto;
import fatec.poo.model.Recepcionista;
import fatec.poo.model.Registro;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class DaoRegistro {

    private Connection conn;
    private DaoHospede daoHospede;
    private DaoRecepcionista daoRecepcionista;
    private DaoQuarto daoQuarto;
    private Conexao conexao;

    private void connectBank() {
        conexao = new Conexao("C##JAQUIEL", "BD003048");//usuario e senha
        conexao.setDriver("oracle.jdbc.driver.OracleDriver"); //NA FATEC @apolo
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        daoRecepcionista = new DaoRecepcionista(conexao.conectar());
        daoQuarto = new DaoQuarto(conexao.conectar());
        daoHospede = new DaoHospede(conexao.conectar());
    }

    public DaoRegistro(Connection conn) {
        this.conn = conn;
    }

    public ResultSet consultar(int codigo) {
        ResultSet rs = null;
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement("SELECT * FROM REGISTRO WHERE CODIGO = ?");
            ps.setInt(1, codigo);
            rs = ps.executeQuery();

            if (rs.next() != true) {
                return null;
                //connectBank();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return rs;
    }

    public double reservar(Registro registro) {
        try (PreparedStatement ps = conn.prepareStatement("INSERT INTO REGISTRO (CODIGO, REGFUNCRECEPCIONISTA, CPFHOSPEDE, NUMEROQUARTO, DATAENTRADA, DATASAIDA, VALORHOSPEDAGEM) VALUES (?, ?, ?, ?, ?, ?, ?)")) {
            ps.setInt(1, registro.getCodigo());
            ps.setInt(2, registro.getRecepcionista().getRegFunc());
            ps.setString(3, registro.getHospede().getCpf());
            ps.setInt(4, registro.getQuarto().getNumero());
            ps.setDate(5, Date.valueOf(registro.getDataEntrada()));
            ps.setDate(6, null);
            ps.setDouble(7, registro.getValorHospedagem());

            int result = ps.executeUpdate();

            if (result > 0) {
                System.out.println("Reserva bem-sucedida!");
            } else {
                System.out.println("Nenhum registro inserido.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    public void liberar(Registro registro) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE REGISTRO SET DATASAIDA = ?, VALORHOSPEDAGEM = ? WHERE CODIGO = ?");
            ps.setDate(1, Date.valueOf(registro.getDataSaida()));
            ps.setDouble(2, registro.getValorHospedagem());
            ps.setInt(3, registro.getCodigo());
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return;
    }

    public ResultSet consultarTotalFaturado(int codigo) {
        ResultSet rs = null;
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement("SELECT * FROM REGISTRO WHERE CODIGO = ?");
            ps.setInt(1, codigo);
            rs = ps.executeQuery();

            if (rs.next() != true) {
                return null;
                //connectBank();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return rs;
    }

}
