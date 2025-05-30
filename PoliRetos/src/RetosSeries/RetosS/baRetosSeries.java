package RetosSeries.RetosS;

import java.util.Scanner;

public class baRetosSeries {

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

    public static void retoseriesFibonacci() {
        int cantidad = 10;

        int a = 0;
        int b = 1;
        int denominador = 2;

        System.out.println("Secuencia de series (Fibonacci):");

        for (int i = 0; i < cantidad; i++) {
            System.out.println(a + "/" + denominador);
            int siguiente = a + b;
            a = b;
            b = siguiente;
            denominador += 2;
        }
    }
    public static void retoPotenciasDeDos() {
        int cantidad = 10;
        int valor = 2;

        System.out.println("Secuencia de potencias de 2:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(valor);
            valor *= 2;
        }
    }
    public static void retoSimbolosIncrementales() {
    int cantidad = 10;
    int longitud = 2;
    int incremento = 1;
    int contadorIncrementos = 0;

    System.out.println("Secuencia de símbolos '++ +++ +++++ ...':");

    for (int i = 0; i < cantidad; i++) {

        for (int j = 0; j < longitud; j++) {
            System.out.print("+");
        }
        System.out.println();


        longitud += incremento;
        contadorIncrementos++;


        if (contadorIncrementos == 2) {
            incremento++;
            contadorIncrementos = 0;
        }
    }
}

public static void retoLetrasIncrementales() {
    int cantidad = 10;
    int repeticiones = 2;
    char letra = 'a';

    System.out.println("Secuencia de letras con repeticiones:");

    for (int i = 0; i < cantidad; i++) {
        for (int j = 0; j < repeticiones; j++) {
            System.out.print(letra);
        }
        System.out.println();

        letra++;
        repeticiones += 2;
    }
}

}
