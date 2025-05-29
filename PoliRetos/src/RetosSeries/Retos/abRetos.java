package RetosSeries.Retos;

import java.util.Scanner;

public class abRetos {

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

}
