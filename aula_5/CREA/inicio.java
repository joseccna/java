package aula_5.CREA;
import java.util.Scanner;

public class inicio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            // Exibe o menu
            System.out.println("\n===== MENU ENGENHEIROS =====");
            System.out.println("1 - Cadastrar Engenheiro Civil");
            System.out.println("2 - Cadastrar Engenheiro de Produção");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpa o buffer

            if (opcao == 1 || opcao == 2) {
                // Entrada de dados comum
                System.out.print("Digite o número do CREA: ");
                int creaNum = sc.nextInt();
                sc.nextLine(); // limpa o buffer

                System.out.print("Digite o nome do engenheiro: ");
                String nome = sc.nextLine();

                System.out.print("Digite a idade do engenheiro: ");
                int idade = sc.nextInt();

                // Criação do objeto conforme a opção
                if (opcao == 1) {
                    EngenheiroCivil engCivil = new EngenheiroCivil(nome, idade, creaNum);
                    engCivil.documento();
                    engCivil.calcularEstruturas();
                } else if (opcao == 2) {
                    EngenheiroProducao engProd = new EngenheiroProducao(nome, idade, creaNum);
                    engProd.documento();
                    engProd.planejarProducao();
                }
            } else if (opcao == 0) {
                System.out.println("Encerrando o programa...");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
