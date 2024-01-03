package fatec.poo.model;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;


/**
 *
 * @author raven, jaquiel, rayane
 */
public class Registro{
    private int codigo;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private double valorHospedagem;
    
    private Hospede hospede;
    private Quarto quarto;
    private Recepcionista recepcionista;
    private ArrayList<ServicoQuarto> servicosQuarto;
    public Object daoRegistro;


    
    public Registro(int codigo, LocalDate dataEntrada, Recepcionista recepcionista) {
        this.codigo = codigo;
        this.dataEntrada = dataEntrada;
        this.recepcionista = recepcionista;
        servicosQuarto = new ArrayList<>();
    }

   

    public void reservarQuarto(Hospede hospede, Quarto quarto) {
        this.quarto = quarto;
        this.hospede = hospede;
        hospede.addRegistro(this);
        quarto.reservar(); // Chama o método de reserva da classe quarto
    }
    
     public int getDiasHospedados() {
        if (dataSaida != null && dataEntrada != null) {
            return (int) ChronoUnit.DAYS.between(dataEntrada, dataSaida);
        } else {
            return 0;
        }
    }
     
    // Método para liberar o quarto e calcular o valor a ser pago
    public double liberarQuarto() {
            double valorHospedagem = quarto.liberar(getDiasHospedados());
            
            valorHospedagem -= (valorHospedagem * (hospede.getTaxaDesconto()/100));
            double totalServicosQuarto = 0.0;
            for (ServicoQuarto servico : servicosQuarto) {
                totalServicosQuarto += servico.getValor();
            }
            double valorTotal = valorHospedagem + totalServicosQuarto;
            
            return valorTotal;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public int getCodigo() {
        return codigo;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public double getValorHospedagem() {
        return valorHospedagem;
    }

    public void setValorHospedagem(double valorHospedagem) {
        this.valorHospedagem = valorHospedagem;
    }
    
    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }
    
    public void setRecepcionista(Recepcionista recepcionista) {
        this.recepcionista = recepcionista;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }
    
    public Recepcionista getRecepcionista() {
        return recepcionista;
    }
    
    // Métodos para adicionar e listar serviços de quarto
    public void adicionarServicoQuarto(ServicoQuarto servico) {
        servicosQuarto.add(servico);
    }

    public ArrayList<ServicoQuarto> listarServicosQuarto() {
        return servicosQuarto;
    }
    
    public static boolean validarCodigoRegistro(String codigo) {
        try {
            int cod = Integer.parseInt(codigo);
            return cod > 0; // Considerando que números negativos não são válidos
        } catch (NumberFormatException e) {
            return false; // Se não for possível converter para int, é inválido
        }
    }

    
}
