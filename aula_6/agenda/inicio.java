package aula_6.agenda;
import java.util.Scanner;


public class inicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int opcao;

        agenda a1 = new agenda();


        do {
            // Exibe o menu
            System.out.println("\n===== Agenda =====");
            System.out.println("1 - Cadastrar usuario na agenda");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpa o buffer

            if (opcao == 1 ) {
                // Entrada de dados comum
                System.out.print("Digite o nome: ");
                String nome = sc.nextLine();
                a1.setNome(nome);
                System.out.print("Digite o email: ");
                String email = sc.nextLine();
                while (!email.contains("@")) {
                    System.out.print("Email inválido. Digite novamente: ");
                    email = sc.nextLine();
                }
                a1.setEmail(email);
                System.out.print("Digite o celular: ");
                String celular = sc.nextLine();
                a1.setCelular(celular);


                // exibe os dados
                cadastra c1 = new cadastra(a1.getNome(), a1.getEmail(), a1.getCelular());
                c1.exibirDados();   


                
            } else if (opcao == 0) {
                System.out.println("Encerrando o programa...");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        sc.close();


    }

    
}
