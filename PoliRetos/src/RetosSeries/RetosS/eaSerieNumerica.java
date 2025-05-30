package RetosSeries.RetosS;

import java.util.Scanner;

public class eaSerieNumerica {
    static Scanner sc = new Scanner(System.in);

    public static void serieNumerica() {
        System.out.println("Reto 2: Serie Numerica");
        System.out.print("Ingrese el número de términos para la serie: ");
        int numTerminos = sc.nextInt();

        for (int i = 1; i <= numTerminos; i++) {
            System.out.print((i * 2 - 1) + " ");
            System.out.print("0 ");
        }
        System.out.println();
    }


 public static void serieS7() {
        System.out.println("Reto 7: progresión aritmética de diferencia 3");
        System.out.print("Ingrese el número de términos para la serie S7: ");
        int numTerminos = sc.nextInt();

        int valorInicial = 1;
        int diferencia = 3;

        for (int i = 0; i < numTerminos; i++) {
            System.out.print(valorInicial + i * diferencia + " ");
        }
        System.out.println();
    }
   

public static void SerieCaracteresS1() {
        System.out.println("Reto 12: alternancia de signos + - + - ...");
        System.out.print("Ingrese el número de términos para la serie S1: ");
        int numTerminos = sc.nextInt();

        for (int i = 0; i < numTerminos; i++) {
            if (i % 2 == 0) {
                System.out.print("+ ");
            } else {
                System.out.print("- ");
            }
        }
        System.out.println();
    }

public static void serieLetrasS6() {
        System.out.println("Reto 17: letras consecutivas del alfabeto a b c d ...");
        System.out.print("Ingrese el número de términos para la serie S6: ");
        int numTerminos = sc.nextInt();

        for (int i = 0; i < numTerminos; i++) {
            char letra = (char) ('a' + i);
            System.out.print(letra + " ");
        }
        System.out.println();
    }
}