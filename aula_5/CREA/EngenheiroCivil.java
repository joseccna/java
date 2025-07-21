package aula_5.CREA;

public class EngenheiroCivil extends engenheiro {
    public EngenheiroCivil(String nome, int idade, int crea) {
        super(nome, idade, crea);
    }

    public void calcularEstruturas() {
        System.out.println("Calculando estruturas...");
    }
}