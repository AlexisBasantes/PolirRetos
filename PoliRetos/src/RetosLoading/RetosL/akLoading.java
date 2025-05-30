package RetosLoading.RetosL;

import java.util.Scanner;

public class akLoading {

    public static void mostrarBarraCarga() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el carácter para la carga: ");
        char simbolo = sc.next().charAt(0);
        System.out.print("Introduce el porcentaje de carga (0-100): ");
        int porcentaje = sc.nextInt();

        int longitudBarra = 20;
        int cantidadSimbolos = longitudBarra * porcentaje / 100;

        System.out.print("[");
        for (int i = 0; i < longitudBarra; i++) {
            if (i < cantidadSimbolos) {
                System.out.print(simbolo);
            } else {
                System.out.print(" ");
            }
        }
        System.out.println("] " + porcentaje + "%");
    }

    public static void barraRotacional(int porcentaje) {
        int longitudBarra = 20;
        int llenos = longitudBarra * porcentaje / 100;
        char[] rotacion = {'\\', '|', '/', '-'};
        for (int i = 0; i < rotacion.length; i++) {
            System.out.print("[");
            for (int j = 0; j < longitudBarra; j++) {
                if (j < llenos - 1) {
                    System.out.print("=");
                } else if (j == llenos - 1 && llenos > 0) {
                    System.out.print(rotacion[i]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("] " + porcentaje + "%");
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void escaleraCarga() {
        int escalones = 6;
        String escalon = "___|";
        String carga = "o0o 100%";
        for (int i = 0; i < escalones; i++) {
            // Imprime espacios para desplazar el escalón
            System.out.print("    ".repeat(i));
            System.out.println(escalon);
            // Imprime espacios para alinear la carga
            System.out.print("    ".repeat(i));
            System.out.println(carga);
        }
    }
}
    