package aula_1;

public class operadores {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 5;

        // Aritimeticos
        System.out.println("a + b = " + (num1 + num2)); // Soma
        System.out.println("a - b = " + (num1 - num2)); // Subtração
        System.out.println("a * b = " + (num1 * num2)); // Multiplicação
        System.out.println("a / b = " + (num1 / num2)); // Divisão
        System.out.println("a % b = " + (num1 % num2)); // Módulo ou resto da divisão

        //Comparação
        System.out.println("a > b " + (num1 > num2)); // Maior que
        System.out.println("a == b " + (num1 == num2)); // Igualdade
        System.out.println("a < b " + (num1 < num2)); // Menor que
        System.out.println("a != b " + (num1 != num2)); // Diferente de
        
        // Lógicos
        boolean condicao1 = (num1 > 8); // true verdadeira 
        boolean condicao2 = (num2 > 10); // false falsa
        System.out.println("Logico e : " + (condicao1 && condicao2)); // E lógico
        System.out.println("Logico ou : " + (condicao1 || condicao2)); // Ou lógico
        System.out.println("Logico não : " + !condicao1); // Não lógico
        System.out.println(true + " true é verdadeiro");
        System.out.print("teste de print sem quebra de linha");
        System.out.println("teste de print com quebra de linha");
        
    }
}
