package fatec.poo.model;

/**
 *
 * @author raven, jaquiel, rayane
 */
public class ServicoQuarto {
    private int codigo;
    private String descricao;
    private double valor;
    
    public ServicoQuarto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    } 

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public static boolean validarCodigoQuarto(String codigo) {
        try {
            int cod = Integer.parseInt(codigo);
            return cod > 0; // Considerando que números negativos não são válidos
        } catch (NumberFormatException e) {
            return false; // Se não for possível converter para int, é inválido
        }
    }
}
