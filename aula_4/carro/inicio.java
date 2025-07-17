package aula_4.carro;

public class inicio {
    public static void main(String[] args) {
        carro meuCarro = new carro();
        meuCarro.cor = "azul";
        meuCarro.modelo = "Fusca";
        meuCarro.ano = 1975;

        
        
        meuCarro.abrirPortasMalas(); // Chama o método abrirPortasMalas do objeto carro
        meuCarro.ligar(); // Chama o método ligar do objeto veiculo
    }

    
}
