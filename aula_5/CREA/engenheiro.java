package aula_5.CREA;

abstract class engenheiro implements crea {
    
    // Atributos privados
    private String nome;
    private int idade;
    private int crea;

    // Construtor
    public engenheiro(String nome, int idade, int crea) {
        this.nome = nome;
        this.idade = idade;
        this.crea = crea; // Exemplo de CREA fixo
    }

    // Métodos públicos para acessar os atributos (getters)
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getCrea() {
        return crea;
    }

    // Métodos públicos para modificar os atributos (setters)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCrea(int crea) {
        this.crea = crea;
    }

    public void setIdade(int idade) {
        if (idade >= 0) { // regra de validação
            this.idade = idade;
        } else {
            System.out.println("Idade inválida!");
        }
    }

    @Override
    public void documento() {
        System.out.println("Documento do engenheiro: " + crea +" Nome: "+ nome + ", Idade: " + idade);
    }
    
}
