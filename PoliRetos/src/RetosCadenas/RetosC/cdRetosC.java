package RetosCadenas.RetosC;

import java.util.Scanner;

public class cdRetosC {
    public static void convertirMayusMinus() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();

        System.out.print("Letra a convertir a MAYÚSCULA: ");
        char letraMayus = scanner.nextLine().charAt(0);

        System.out.print("Letra a convertir a minúscula: ");
        char letraMinus = scanner.nextLine().charAt(0);

        StringBuilder nuevaFrase = new StringBuilder();

        for (char c : frase.toCharArray()) {
            if (Character.toLowerCase(c) == Character.toLowerCase(letraMayus)) {
                nuevaFrase.append(Character.toUpperCase(c));
            } else if (Character.toLowerCase(c) == Character.toLowerCase(letraMinus)) {
                nuevaFrase.append(Character.toLowerCase(c));
            } else {
                nuevaFrase.append(c);
            }
        }

        System.out.println("Resultado: " + nuevaFrase);
    }
}

