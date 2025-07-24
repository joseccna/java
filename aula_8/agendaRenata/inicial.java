package aula_8.agendaRenata;

public class inicial {
    public static void main(String[] args) {
        agenda p = new agenda("Elena", 64, "ID12345");


        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());
        System.out.println("ID: " + p.getID());
    }

}
