package RetosLoading.RetosL;

import java.util.Scanner;

public class baRetosLoading {

    static Scanner lecturaDatos = new Scanner(System.in);
    public static void movimientoCarga() {
        System.out.println("Reto 4: Movimiento de carga o0o");
        System.out.println("Ingrese el paso de la animación (1-10):");
        int paso = lecturaDatos.nextInt();
        String[] animacion = {"o0o", "0o0", "o0o"};
        for (int i = 0; i <= 100; i += paso) {
            int fase = (i / paso) % animacion.length;
            System.out.print("\r" + animacion[fase] + " " + i + "%");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}
        }
        System.out.println();
    }
    
    public static void cargaConNombre() {
        System.out.println("Reto 9: Carga con nombre y apellidos");
        System.out.print("Ingrese su nombre y apellidos: ");
        String nombre = lecturaDatos.nextLine();

        char[] letras = nombre.toCharArray();
        int total = letras.length;

        for (int i = 0; i < total; i++) {
            System.out.print("\r");
            for (int j = 0; j < total; j++) {
                if (j == i) {
                    System.out.print(letras[j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  " + ((i + 1) * 100 / total) + "%");

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {}
        }
        System.out.println();
    }

}
