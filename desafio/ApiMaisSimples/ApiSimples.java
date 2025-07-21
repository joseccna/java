package desafio.ApiMaisSimples;


// Importa a classe URI para manipular URIs
import java.net.URI;
// Importa a classe URL para acessar o conteúdo da web
import java.net.URL;

// Importa a classe Scanner para ler o conteúdo da URL
import java.util.Scanner;


// Declaração da classe pública chamada ApiSimples
public class ApiSimples {
        // Método principal: ponto de entrada do programa
    // 'throws Exception' permite que qualquer erro seja lançado diretamente sem try/catch
    public static void main(String[] args) throws Exception {

        // Cria um objeto URL com o endereço da API que será acessada
        //URL url = new URL("https://jsonplaceholder.typicode.com/todos/1");

        URI uri = new URI("https://jsonplaceholder.typicode.com/todos/1");
        URL url = uri.toURL();

        // Abre a conexão com a URL e usa Scanner para ler o conteúdo
        // useDelimiter("\\A") faz com que o Scanner leia todo o conteúdo de uma vez só
        // next() retorna o conteúdo completo como uma única String
        try(Scanner scanner = new Scanner(url.openStream())){
            String conteudo = scanner.useDelimiter("\\A").next();
        

        // Imprime no console a mensagem inicial
        System.out.println("Resposta da API:");

        // Imprime o conteúdo retornado pela API (em formato JSON)
        System.out.println(conteudo);
        }
    }
}

    

