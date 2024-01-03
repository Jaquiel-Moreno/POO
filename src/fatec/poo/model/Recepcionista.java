package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author raven, jaquiel, rayane
 */
public class Recepcionista extends Pessoa{
    private int regFunc;
    private String turno;
    private Double TaxaDesconto;
    private ArrayList<Registro> registro;
    
    public Recepcionista(int regFunc, String nome){
        super(nome);
        this.regFunc = regFunc;
        this.registro = new ArrayList<Registro>();
    }

    public String getTurno() {
        return turno;
    }

   public void setTurno(String turno) {
        this.turno = turno;
    }
   
    public int getRegFunc() {
        return regFunc;
    }
    
    
    public void addRegistro(Registro registro) {
        this.registro.add(registro);
        registro.setRecepcionista(this);
    }
    
    public static boolean validarRegFunc(String regFunc) {
        try {
            int num = Integer.parseInt(regFunc);
            return num > 0; // Considerando que números negativos não são válidos
        } catch (NumberFormatException e) {
            return false; // Se não for possível converter para int, é inválido
        }
    }

}
