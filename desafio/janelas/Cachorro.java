package desafio.janelas;
;

public class Cachorro implements Animal {
    @Override
    public void fazerSom() {
        System.out.println("Au Au");
    }

    @Override
    public void mover() {
        System.out.println("O cachorro está correndo alegremente.");
    }
    
}
