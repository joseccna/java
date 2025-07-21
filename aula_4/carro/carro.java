package aula_4.carro;

class carro extends veiculo {
    @Override
    public void ligar() {
        System.out.println("O carro " + modelo + " da cor " + cor + " e do ano " + ano + " está ligado.");
    } 
    boolean temPortasMalas = true;

    void abrirPortasMalas() {
       System.out.println("Abrindo o porta-malas do carro " + modelo);
    }
        


}
