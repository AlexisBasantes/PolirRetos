package RetosFiguras.RetosF;

import java.util.Scanner;

public class abRetosFiguras {

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
        for (int filas = 1; filas < numEscalones; filas++){
            for (int columnas = 1; columnas < aux; columnas++){
                System.out.println(columnas);
                aux--;
            }
        }
    }

}
