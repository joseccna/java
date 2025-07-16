package aula_3;

public class MetodosMath {
    public static void main(String[] args) {
        double numero1 = -25.7;
        double numero2 = 16;
        double numero3 = 7.3;
        double base = 2;
        double expoente = 3;

        System.out.println("Valor absoluto: Math.abs(" + numero1 + ") = " + Math.abs(numero1));
        System.out.println("Arredondamento para cima: Math.ceil(" + numero3 + ") = " + Math.ceil(numero3));
        System.out.println("Arredondamento para baixo: Math.floor(" + numero3 + ") = " + Math.floor(numero3));
        System.out.println("Arredondamento normal: Math.round(" + numero3 + ") = " + Math.round(numero3));
        System.out.println("Máximo entre dois números: Math.max(" + numero1 + ", " + numero3 + ") = " + Math.max(numero1, numero3));
        System.out.println("Mínimo entre dois números: Math.min(" + numero1 + ", " + numero3 + ") = " + Math.min(numero1, numero3));
        System.out.println("Potência: Math.pow(" + base + ", " + expoente + ") = " + Math.pow(base, expoente));
        System.out.println("Raiz quadrada: Math.sqrt(" + numero2 + ") = " + Math.sqrt(numero2));
        System.out.println("Raiz cúbica: Math.cbrt(" + numero2 + ") = " + Math.cbrt(numero2));
        System.out.println("Número aleatório entre 0.0 e 1.0: Math.random() = " + Math.random());
        System.out.println("Logaritmo natural (ln): Math.log(" + numero2 + ") = " + Math.log(numero2));
        System.out.println("Logaritmo base 10: Math.log10(" + numero2 + ") = " + Math.log10(numero2));
        System.out.println("Seno (em radianos): Math.sin(Math.PI/2) = " + Math.sin(Math.PI / 2));
        System.out.println("Cosseno (em radianos): Math.cos(0) = " + Math.cos(0));
        System.out.println("Tangente (em radianos): Math.tan(Math.PI/4) = " + Math.tan(Math.PI / 4));
        System.out.println("Número PI: Math.PI = " + Math.PI);
        System.out.println("Número Euler: Math.E = " + Math.E);
    }
}
