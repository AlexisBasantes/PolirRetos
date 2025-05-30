package RetosFiguras.RetosF;

import java.util.Scanner;

public class baRetosFiguras {

    static Scanner lecturaDatos = new Scanner(System.in);
        
    public static void CuadradoIntercalado() {
        System.out.println("Reto 2: Cuadrado Intercalado (* y +)");
        System.out.println("Ingrese el tamaño del cuadrado:");
        int tamano = lecturaDatos.nextInt();

        for (int fila = 0; fila < tamano; fila++) {
            for (int col = 0; col < tamano; col++) {

                // Esquina o borde en patrón + alternado
                if (fila == 0 || fila == tamano - 1) {
                // Alternar * y +
                System.out.print((col % 2 == 0) ? "*" : "+");
                } else if (col == 0 || col == tamano - 1) {
                System.out.print((fila % 2 == 0) ? "* " : "+");
                } else {
                System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void Escalera1() {
        System.out.println("Reto 7: Escalera 1");
        System.out.println("Ingrese el número de escalones:");
        int numEscalones = lecturaDatos.nextInt();

        String espacio = "\t";
        for (int i = 1; i <= numEscalones; i++) {
            System.out.println(espacio.repeat(i) + "-------");
            System.out.println(espacio.repeat(i) + "       |");
        }
    }

    public static void EscaleraNumInvertida() {
        System.out.println("Reto 12: Escalera Numérica Invertida");
        System.out.println("Ingrese el número de escalones:");
        int numEscalones = lecturaDatos.nextInt();

        int aux = numEscalones;
        for (int i = numEscalones; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void adnNumeros() {
        System.out.println("Reto 17: ADN con Números 0 y 1");
        System.out.println("Ingrese la longitud del ADN (filas):");
        int longFila = lecturaDatos.nextInt();

        for (int i = 0; i < longFila; i++) {
            for (int j = 0; j < longFila; j++) {
                // Fila 1 y 5: imprimir 1 en extremos
                if ((i == 0 || i == 4) && (j == 0 || j == 4)) {
                    System.out.print("1");
                }
                // Fila 2 y 4: imprimir 0 en 2 y 4
                else if ((i == 1 || i == 3) && (j == 1 || j == 3)) {
                    System.out.print("0");
                }
                // Fila 3: imprimir 1 en el centro
                else if (i == 2 && j == 2) {
                    System.out.print("1");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
