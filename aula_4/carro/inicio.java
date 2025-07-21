package aula_4.carro;

public class inicio {
    public static void main(String[] args) {
        carro meuCarro = new carro();
        meuCarro.cor = "azul";
        meuCarro.modelo = "Fusca";
        meuCarro.ano = 1975;

        
        
        meuCarro.ligar(); // Chama o método ligar do objeto veiculo
        meuCarro.abrirPortasMalas(); // Chama o método abrirPortasMalas do objeto carro
        System.out.println("\n");

        Moto minhaMoto = new Moto();
        minhaMoto.tipo = "esportiva";
        minhaMoto.temBagageiro = false;
        minhaMoto.cor = "vermelha";
        minhaMoto.modelo = "CBR 1000RR";
        minhaMoto.ano = 2020;
        minhaMoto.ligar(); // Chama o método ligar do objeto veiculo 
        minhaMoto.acelerar(); // Chama o método acelerar do objeto Moto 





    }

    
}
