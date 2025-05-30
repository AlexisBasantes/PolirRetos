package RetosCadenas.RetosC;

import java.util.Scanner;

public class baRetosCadenas {

    static Scanner lecturaDatos = new Scanner(System.in);
    public static void eliminarVocalFrase() {
        System.out.println("Reto 3: Eliminar una vocal de una frase");
        System.out.println("Ingrese la frase:");
        String frase = lecturaDatos.nextLine();
        System.out.println("Ingrese la vocal a eliminar:");
        char vocal = lecturaDatos.next().charAt(0);
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (Character.toLowerCase(letra) != Character.toLowerCase(vocal)) {
                System.out.print(letra);
            }
        }
        System.out.println();

    }
    public static void anagrama() {
        System.out.println("Reto 8: Anagrama");

        String[][] pares = {
            {"delira", "lidera"},
            {"ballena", "llenaba"},
            {"alondra", "ladrona"},
            {"españa", "apañes"},
            {"enrique", "quieren"}
        };

        Scanner scanner = new Scanner(System.in);
        int index = (int) (Math.random() * pares.length);
        String palabra = pares[index][0];
        String respuesta = pares[index][1];

        System.out.println("Adivina el anagrama de: " + palabra);

        for (int intento = 1; intento <= 3; intento++) {
            System.out.print("Intento " + intento + ": ");
            String entrada = scanner.nextLine().trim().toLowerCase();

            if (entrada.equals(respuesta)) {
                System.out.println("¡Correcto!");
                return;
            }
        }

        System.out.println("Fallaste 3 veces. La respuesta era: " + respuesta);

    }
    public static void XApellidoYNombre() {
        System.out.println("Reto 12: Formar una X con el apellido y nombre");
        System.out.println("Ingrese su apellido y nombre:");
        String texto = lecturaDatos.nextLine().trim();
        if (texto.isEmpty()) {
            System.out.println("No se ingresó texto.");
            return;
        }
        int n = texto.length();
        char[][] matriz = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = ' ';
            }
        }

        for (int i = 0; i < n; i++) {
            matriz[i][i] = texto.charAt(i);               // diagonal principal
            matriz[i][n - 1 - i] = texto.charAt(i);       // diagonal secundaria
        }

        for (char[] fila : matriz) {
            for (char c : fila) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}


