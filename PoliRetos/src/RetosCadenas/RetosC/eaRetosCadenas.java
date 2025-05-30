package RetosCadenas.RetosC;
import java.util.Scanner;

public class eaRetosCadenas {
     public static void contarLetrasFrase() {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();

        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.isLetter(c)) {
                contador++;
            }
        }

        System.out.println("La frase tiene " + contador + " letras.");
    }

public static void mostrarFraseMayus() {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese una frase: ");
    String frase = sc.nextLine();

    // Convertir a mayúsculas y eliminar la letra J
    String resultado = frase.toUpperCase().replace("J", "");

    System.out.println("Frase procesada: " + resultado);
}

public static void graficarFuncionLinealNombre() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese su nombre (al menos 1 letra): ");
    String nombre = sc.nextLine();

    int longitud = nombre.length();

    // Máximo valor de f(x) = 2x para x = nombre.length() - 1
    int maxY = 2 * (longitud - 1);

    System.out.println();

    for (int y = maxY; y >= 0; y--) {
        System.out.print(y + " | ");
        @SuppressWarnings("unused")
        boolean dibujado = false;

        for (int x = 0; x < longitud; x++) {
            if (2 * x == y) {
                System.out.print(nombre.charAt(x));
                dibujado = true;
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }

    // Eje X
    System.out.print("0 |");
    for (int i = 0; i < longitud * 2; i++) {
        System.out.print("_");
    }
    System.out.println();
}
}


