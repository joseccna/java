package aula_6.pessoa;

    public class inicio {
    public static void main(String[] args) {
        //
        pessoa p1 = new pessoa();
        p1.setNome("jn");
        p1.setIdade(29);
        p1.setEmail("jose@teste.com");
        //
        pessoa p2= new pessoa();
        p2.setNome("Minoru");
        p2.setIdade(25);
        //

        //
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
        if (p1.getEmail() == null) {
            System.out.println("Email inválido.");
        } else {
            System.out.println("Email: " + p1.getEmail());
        }
       
    }

}
