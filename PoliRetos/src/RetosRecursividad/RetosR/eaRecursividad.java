package RetosRecursividad.RetosR;

import java.util.Scanner;

public class eaRecursividad {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("== Retos de Recursividad ==");
        System.out.print("Ingrese un número para calcular su factorial: ");
        int numero = scanner.nextInt();
        
        if (numero < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            System.out.println("Factorial de " + numero + " es: " + factorial(numero));
        }
        
        scanner.close();
    }

    // Método recursivo para calcular factorial sin operadores matemáticos directos
    public static int factorial(int n) {
        if (n == 0) return 1;
        return multiply(n, factorial(n - 1));
    }

    // Multiplicación mediante sumas recursivas
    private static int multiply(int a, int b) {
        if (b == 0) return 0;
        return add(a, multiply(a, b - 1));
    }

    // Suma usando operadores bitwise (sin usar +)
    private static int add(int a, int b) {
        if (b == 0) return a;
        return add(a ^ b, (a & b) << 1);
    }

}
