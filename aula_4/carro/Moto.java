package aula_4.carro;

public class Moto extends veiculo {
    @Override
    public void ligar() {
        System.out.println("A moto " + modelo + " da cor " + cor + " e do ano " + ano + " está ligado.");
    } 

    public String tipo; // Tipo de moto, por exemplo, esportiva, cruiser, etc.
    public boolean temBagageiro; // Indica se a moto tem bagageiro


    public void acelerar() {
        System.out.println("A moto está acelerando.");
    }

    public void parar() {
        System.out.println("A moto está parada.");
    }
    
}
