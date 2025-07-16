package aula_1;

public class incrementar {
    public static void main(String[] args) {
        int num1 = 10;
        int expoente  = 2;

        // Incremento e Decremento
        System.out.println("Aumento de 1: " + ++num1); // Incremento
        System.out.println("Diminuição de 1: " + --num1); // Decremento
        System.out.println("Aumento de 1: " + (num1 += 1)); // Atribuição com incremento
        System.out.println("Diminuição de 1: " + (num1 -= 1)); // Atribuição com decremento
        System.out.println("Aumento de 1: " + (num1 *= 2)); // Atribuição com multiplicação
        System.out.println("Diminuição de 1: " + (num1 /= 2)); // Atribuição com divisão

        System.out.println(num1 + " eleado à " + expoente +" "+ Math.pow(num1, expoente)); // Exponenciação


    }
}
