package fatec.poo.model;

/**
 *
 * @author raven, jaquiel, rayane
 */
public class Quarto {
    private int numero;
    private String tipo;
    private boolean situacao;
    private double valorDiaria;
    private double totalFaturado;
    
    public Quarto(int numero, String tipo, double valorDiaria) {
        this.numero = numero;
        this.tipo = tipo;
        this.valorDiaria = valorDiaria;
        this.situacao = false; // Inicialmente, o quarto está disponível
    }
    
    public void reservar() {
        situacao = true; // Marca o quarto como ocupado    
    }

    public double liberar(int diasOcupados) {
        situacao = false; // Marca o quarto como disponível
        totalFaturado += (diasOcupados * valorDiaria); // Calcula o total faturado
        return (diasOcupados * valorDiaria); // Retorna o valor da hospedagem
    }
    
    public boolean isSituacao() {
        return situacao;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) { //alterado valorDiaria antes
        this.valorDiaria = valorDiaria;
    }

    public double getTotalFaturado() {
        return totalFaturado;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public void setTotalFaturado(double totalFaturado) {
        this.totalFaturado = totalFaturado;
    }
    
    
    public static boolean validarNumeroQuarto(String numero) {
        try {
            int num = Integer.parseInt(numero);
            return num > 0; // Considerando que números negativos não são válidos
        } catch (NumberFormatException e) {
            return false; // Se não for possível converter para int, é inválido
        }
    }   
}
