package desafio.janelas;

public class Papagaio implements Animal {

    @Override
    public void fazerSom(){
        System.out.println("Repete o que eu digo!");
    }
    
    @Override
    public void mover(){
        System.out.println("O papagaio está voando de galho em galho.");
    }

}