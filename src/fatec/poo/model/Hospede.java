package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author raven, jaquiel, rayane
 */
public class Hospede extends Pessoa {
    private String cpf;
    private double taxaDesconto;
    private int idade;
    private ArrayList<Registro> registros;

    public Hospede(String cpf, String nome) {
        super(nome);
        this.cpf = cpf;
        this.registros = new ArrayList<Registro>();
    }

    public double getTaxaDesconto() {
        return taxaDesconto;
    }

    public void setTaxaDesconto(double taxaDesconto) {
        this.taxaDesconto = taxaDesconto;
    }

    public String getCpf() {
        return cpf;
    }

    public void addRegistro(Registro registro) {
        this.registros.add(registro);
        registro.setHospede(this);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public ArrayList<Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(ArrayList<Registro> registros) {
        this.registros = registros;
    }
    
    public static boolean validarCPF(String cpf) {
        // Remover caracteres não numéricos do CPF
        cpf = cpf.replaceAll("[^0-9]", "");

        // Verificar se o CPF possui 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        // Calcular primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * (10 - i);
        }
        int resto = soma % 11;
        int digitoVerificador1 = (resto < 2) ? 0 : (11 - resto);

        // Verificar primeiro dígito verificador
        if (Character.getNumericValue(cpf.charAt(9)) != digitoVerificador1) {
            return false;
        }

        // Calcular segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * (11 - i);
        }
        resto = soma % 11;
        int digitoVerificador2 = (resto < 2) ? 0 : (11 - resto);

        // Verificar segundo dígito verificador
        return Character.getNumericValue(cpf.charAt(10)) == digitoVerificador2;
    }
}