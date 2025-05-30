package RetosSeries.RetosS;
import java.util.Scanner;

public class akRetosSeries {

    public static void imprimirFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("S1 (Fibonacci): ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public void imprimirCuadrados(int n) {
        System.out.print("S6 (Cuadrados perfectos): ");
        for (int i = 1; i <= n; i++) {
            System.out.print((i * i) + " ");
        }
        System.out.println();
    }

    public static void imprimirS11(int n) {
        System.out.print("S12 (n*(n+1)): ");
        for (int i = 1; i <= n; i++) {
            int valor = i * (i + 1);
            System.out.print(valor + " ");
        }
        System.out.println();
    }

    public static void imprimirS5(int n) {
        char[] simbolos = {'\\', '|', '/', '-'};
        System.out.print("S5 (patrón símbolos): ");
        for (int i = 0; i < n; i++) {
            System.out.print(simbolos[i % simbolos.length] + " ");
        }
        System.out.println();
    }

    public void imprimirS9(int n) {
        int a = 1, b = 1; // Fibonacci para repeticiones
        char letra = 'a';

        System.out.println();
    }
}
