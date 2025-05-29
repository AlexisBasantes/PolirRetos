package RetosSeries.RetosS;

import java.util.Scanner;

public class abRetosSeries {

    static Scanner lecturaDatos = new Scanner(System.in);

    public static void secuenciaNumericaYFibonacci() {
        System.out.println("Reto 3: Secuencia numérica");
        System.out.println("Ingrese el número de términos de la secuencia:");

        int numTerminos = lecturaDatos.nextInt();
        int abA = 0, abB = 1;
        int abDenominador = 1;

        for (int abI = 0; abI < numTerminos; abI++) {
            System.out.print(abA + "/" + abDenominador + "  ");

            int abTemp = abA;
            abA = abB;
            abB = abA + abTemp;
            abDenominador += 2;
        }

        System.out.println();
    }

    public static void secuenciaMasCinco() {
        System.out.println("Reto 8: Aumento +5 en la serie");
        System.out.println("Ingrese el número de términos de la serie:");
        int numTerminos = lecturaDatos.nextInt();
        int inicial = 3;
        for (int i = 0; i < numTerminos; i++) {
            System.out.print(inicial + " ");
            inicial += 5;
        }
    }

    public static void secuenciaCaracteres2() {
        System.out.println("Reto 13: Secuencia de caracteres 2");
        System.out.println("Ingrese el número de términos de la secuencia:");
        int numSecuencia = lecturaDatos.nextInt();
        int n = 1, m = 1;

        for (int i = 0; i < numSecuencia; i++) {
            // Imprimir abA veces el signo +
            for (int j = 0; j < n; j++) {
                System.out.print("+");
            }
            System.out.print(" ");

            // Fibonacci siguiente término
            int aux = n;
            n = m;
            m = aux + m;
        }

        System.out.println();
    }

    public static void secuenciaCaracteres7() {
        System.out.println("Reto 18: Secuencia de caracteres 7");
        System.out.println("Ingrese el número de términos de la secuencia:");
        int numTerminos = lecturaDatos.nextInt();
        char letra = 'a';
        boolean sumar = true; // Variable para alternar el signo
        for(int i = 0; i < numTerminos; i++){
            // Imprimir la letra actual
            System.out.print(letra + " ");
            // Incrementar la letra
            letra+=2;
            // Si llega a 'z', reiniciar a 'a'
            if (letra > 'z') {
                letra = 'a';
            }
            if (i < numTerminos - 1) {
                System.out.print(sumar ? "+  " : "-  ");
                sumar = !sumar; // alternar el signo
            }
        }
    }

}
