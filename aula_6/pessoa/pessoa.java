package aula_6.pessoa;

public class pessoa {
    
        private String nome;
        private int idade;
        private int cpf;
        private String email;
        private String celular;
        
        // Getter do nome
    //    public String getNome() {
    //        // return nome;
    //    }

    public String getNome() {
        if (nome.toLowerCase().contains("a")) {
            System.out.println("Nome inválido (contém a letra 'a').");
            return null;
        }
        return nome;
    }

    // Setter do nome
    public void setNome(String nome) {
        // nome = nome
        this.nome = nome;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public int getCpf() {
        return cpf;
    }
    public void setEmail(String email) {
        if (!email.contains("@")) {
            return;
        }
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getCelular() {
        return celular;
    }



    // Getter da idade
    public int getIdade() {
        return idade;
    }

    // Setter da idade
    public void setIdade(int idade) {
        if (idade >= 25) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida.");
        }
    }
}