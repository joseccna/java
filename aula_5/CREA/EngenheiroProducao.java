package aula_5.CREA;

public class EngenheiroProducao extends engenheiro {
    
    // Construtor
    public EngenheiroProducao(String nome, int idade, int crea) {
        super(nome, idade, crea);
    }

    // Método específico para Engenheiro de Produção
    public void planejarProducao() {
        System.out.println("Planejando a produção...");
    }
    
}
