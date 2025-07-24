package aula_8.agendaRenata;



// implementa o método getID() obrigatoriamente
public class agenda implements janela {
    private String nome;
    private int idade;
    private String id;  // atributo para guardar o ID único

    public agenda(String nome, int idade, String id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    // Método obrigatório da interface, retorna o ID
    public String getID() {
        return id;
    }

}
