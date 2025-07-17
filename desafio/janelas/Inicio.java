package desafio.janelas;

public class Inicio  {

    public static void main(String[] args) {

        System.out.println("Aula de Interfaces");
        Gato g = new Gato();
        Cachorro c = new Cachorro();
        Papagaio p = new Papagaio();

        g.fazerSom();
        g.mover();

        c.fazerSom();
        c.mover();

        p.fazerSom();
        p.mover();
    }
    
}
