package aula_3;

public class MediaNota {
    public static void main(String[] args) {
        String nomeAluno = "João Silva";
        String curso = "Engenharia de Software";



        double semestre1 = (Math.random() * 10)+1; // Simulando notas aleatórias;
        double semestre2 = (Math.random() * 10)+1; // Simulando notas aleatórias;
        double semestre3 = (Math.random() * 10)+1; // Simulando notas aleatórias;
        double semestre4 = (Math.random() * 10)+1; // Simulando notas aleatórias; 
        double semestre5 = (Math.random() * 10)+1; // Simulando notas aleatórias;
        double semestre6 = (Math.random() * 10)+1; // Simulando notas aleatórias;
        double semestre7 = (Math.random() * 10)+1; // Simulando notas aleatórias;
        double semestre8 = (Math.random() * 10)+1; // Simulando notas aleatórias;
        double semestre9 = (Math.random() * 10)+1; // Simulando notas aleatórias;
        double semestre10 = (Math.random() * 10)+1; // Simulando notas aleatórias;


    
        double media = (semestre1 + semestre2 + semestre3 + semestre4 + semestre5
         + semestre6 + semestre7 + semestre8 + semestre9 + semestre10) / 10;


        System.out.println("\n");
        System.out.printf("Notas dos semestres: " + "\n" + "Primeiro - semestre: %.2f\n",  semestre1); 
        System.out.printf("Segundo  - semestre: %.2f\n",  semestre2); 
        System.out.printf("Terceiro - semestre: %.2f\n",  semestre3);
        System.out.printf("Quarto   - semestre: %.2f\n",  semestre4);
        System.out.printf("Quinto   - semestre: %.2f\n",  semestre5);
        System.out.printf("Sexto    - semestre: %.2f\n",  semestre6);
        System.out.printf("Sétimo   - semestre: %.2f\n",  semestre7);
        System.out.printf("Oitavo   - semestre: %.2f\n",  semestre8);
        System.out.printf("Nono     - semestre: %.2f\n",  semestre9);
        System.out.printf("Décimo   - semestre: %.2f\n",  semestre10);
        System.out.println("Nome do aluno: " + nomeAluno);
        System.out.println("Curso: " + curso);
               
        System.out.printf("Média dos semestres: %.2f\n",  media);
        if (media >= 6) {
            System.out.println("Situação: Aprovado");
        } else if (media >= 5 && media < 6) {
            System.out.println("Situação: Em recuperação");
        } else {
            System.out.println("Situação: Reprovado");
        }

    }
}
