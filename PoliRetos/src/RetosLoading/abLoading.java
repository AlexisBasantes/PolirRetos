package RetosLoading;

import java.util.Scanner;

public class abLoading {

    public static void retoLoading() {
    int total = 20;

    for (int i = 1; i <= total; i++) {
        // Limpiar línea anterior
        System.out.print("\r");

        // Construir la barra de progreso
        StringBuilder barra = new StringBuilder("[");
        for (int j = 1; j < i; j++) {
            barra.append("=");
        }

        // Punta animada
        if (i < total) {
            barra.append((i % 2 == 0) ? ">" : "-");
            for (int j = i + 1; j <= total; j++) {
                barra.append(" ");
            }
        } else {
            barra.append("=");
        }

        barra.append("] ").append(i * 5).append("%");

        System.out.print(barra);

        try {
            Thread.sleep(200); // pausa de 200 ms
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // restablecer el estado de interrupción
            System.err.println("La animación fue interrumpida.");
            break; // salir del bucle si fue interrumpido
        }
    }

    System.out.println(); // salto de línea final
}

public static void retoSpinner() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el número de escalones: ");
    int niveles = scanner.nextInt();

    for (int i = 0; i < niveles; i++) {
        for (int j = 0; j < i; j++) {
            System.out.print("    ");
        }

        System.out.print("|___");

        for (int k = 0; k < 3; k++) {
            System.out.print(".");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Interrupción detectada durante animación.");
                return;
            }
        }

        System.out.println(" / 100%");
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Interrupción detectada durante pausa.");
            return;
        }
    }
}


}
