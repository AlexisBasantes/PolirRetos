package RetosCadenas;

import java.util.Scanner;

public class abCadenas {
    public static void retoEliminarLetra() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese una frase: ");
    String frase = scanner.nextLine();

    System.out.print("Ingrese una letra a eliminar: ");
    String letra = scanner.nextLine();

    if (letra.length() != 1) {
        System.out.println("Por favor ingrese solo una letra.");
        return;
    }

    char letraAEliminar = letra.charAt(0);
    String resultado = frase.replaceAll("(?i)" + letraAEliminar, "");

    System.out.println("Frase resultante: " + resultado);
}
public static void retoCambiarLetras() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese una frase: ");
    String frase = scanner.nextLine();

    System.out.print("Ingrese la letra que desea convertir a MAYÚSCULA: ");
    String letraMayus = scanner.nextLine();

    System.out.print("Ingrese la letra que desea convertir a minúscula: ");
    String letraMinus = scanner.nextLine();

    if (letraMayus.length() != 1 || letraMinus.length() != 1) {
        System.out.println("Por favor, ingrese una sola letra para cada caso.");
        return;
    }

    char aMayus = letraMayus.toLowerCase().charAt(0);
    char aMinus = letraMinus.toUpperCase().charAt(0);

    StringBuilder resultado = new StringBuilder();

    for (char c : frase.toCharArray()) {
        if (Character.toLowerCase(c) == aMayus) {
            resultado.append(Character.toUpperCase(c));
        } else if (Character.toUpperCase(c) == aMinus) {
            resultado.append(Character.toLowerCase(c));
        } else {
            resultado.append(c);
        }
    }

    System.out.println("Frase modificada: " + resultado.toString());
}

}
