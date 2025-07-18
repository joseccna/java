package desafio.get_set_paciente;

public class inicio {
    public static void main(String[] args) {
        Paciente p = new Paciente("Maria", 30);

        System.out.println(p.getNome()); // Maria
        System.out.println(p.getIdade()); // 30

        p.setIdade(-5); // "Idade inválida!" – proteção via encapsulamento
        p.setNome("João");
        System.out.println(p.getNome()); // João
    }
}
