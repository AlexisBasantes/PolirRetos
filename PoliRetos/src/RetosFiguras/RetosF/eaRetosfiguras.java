package RetosFiguras.RetosF;
import java.util.Scanner;


public class eaRetosfiguras {
  static Scanner sc = new Scanner(System.in);
  
    public static void mostrarFiguraF1() {
        System.out.print("Ingrese el tamaño de la figura: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("El tamaño debe ser mayor.");
            return;
        }

        System.out.println("Figura F1:");

        for (int fila = 0; fila < n; fila++) {
            for (int col = 0; col < n; col++) {
                if (fila == 0 || fila == n - 1 || col == 0 || col == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

public static void mostrarFiguraF6() {
    System.out.print("Ingrese el número de niveles de la pirámide: ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n - i; j++) {
            System.out.print(" ");
        }
        for (int k = 1; k <= (2 * i - 1); k++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void mostrarFiguraF11() {
    System.out.print("Ingrese el número de niveles: ");
    int niveles = sc.nextInt();

    for (int i = 1; i <= niveles; i++) {
        // Espacios al inicio (indentación creciente)
        for (int s = 1; s < i; s++) {
            System.out.print("    "); // 4 espacios por nivel
        }

        // Imprimir la línea con '| _ _ _'
        System.out.print("|");
        for (int j = 1; j <= i; j++) {
            System.out.print(" _");
        }
        System.out.println();
    }
}


public static void mostrarFiguraF16() {
    System.out.print("Ingrese el número de niveles (impar y mayor o igual a 3): ");
    int niveles = sc.nextInt();

    if (niveles < 3 || niveles % 2 == 0) {
        System.out.println("El número debe ser impar y mayor o igual a 3.");
        return;
    }

    int medio = niveles / 2;

    for (int i = 0; i < niveles; i++) {
        int espacios = Math.abs(medio - i);

        // Sangría inicial
        for (int j = 0; j < espacios; j++) {
            System.out.print("  ");
        }

        if (i % 2 == 0) {
            if (i == 0 || i == niveles - 1) {
                System.out.println("+       +");
            } else {
                System.out.println("   +");
            }
        } else {
            System.out.println("-     -");
        }
    }
}
}