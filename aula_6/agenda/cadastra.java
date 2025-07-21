package aula_6.agenda;

public class cadastra extends agenda {
    public cadastra(String nome, String email, String celular) {
        super.setNome(nome);
        super.setEmail(email);
        super.setCelular(celular);
    }


    public void exibirDados() {
        System.out.println("Nome: " + super.getNome());
        System.out.println("Email: " + super.getEmail());
        System.out.println("Celular: " + super.getCelular());
    }
}
