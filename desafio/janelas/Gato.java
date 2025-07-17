package desafio.janelas;

public class Gato   implements Animal {
    @Override
    public void fazerSom() {
        System.out.println("Miau");
    }

    @Override
    public void mover() {
        System.out.println("O gato está se movendo silenciosamente.");
    }
    
}
