package RetosCadenas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
public static void retoMatrizCuadrada() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su primer nombre completo (sin espacios): ");
        String nombre1 = scanner.nextLine().replace(" ", "");

        System.out.print("Ingrese su segundo nombre/apellido (sin espacios): ");
        String nombre2 = scanner.nextLine().replace(" ", "");

        int size = Math.max(nombre1.length(), nombre2.length());
        char[][] matriz = new char[size][size];

        for (int i = 0; i < size; i++) {
            Arrays.fill(matriz[i], ' ');
        }

        List<int[]> posicionesLibres = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                posicionesLibres.add(new int[]{i, j});
            }
        }

        Collections.shuffle(posicionesLibres);
        Map<String, Character> posicionesNombre1 = new HashMap<>();
        for (char letra : nombre1.toCharArray()) {
            if (posicionesLibres.isEmpty()) break;
            int[] pos = posicionesLibres.remove(0);
            String key = pos[0] + "," + pos[1];
            posicionesNombre1.put(key, letra);
        }

        Collections.shuffle(posicionesLibres);
        for (char letra : nombre2.toCharArray()) {
            if (posicionesLibres.isEmpty()) break;
            int[] pos = posicionesLibres.remove(0);
            String key = pos[0] + "," + pos[1];

            if (posicionesNombre1.containsKey(key)) {
                matriz[pos[0]][pos[1]] = '*';
            } else {
                matriz[pos[0]][pos[1]] = letra;
            }

            mostrarMatriz(matriz);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Interrupción detectada durante sleep.");
            }
        }

        for (Map.Entry<String, Character> entry : posicionesNombre1.entrySet()) {
            String[] indices = entry.getKey().split(",");
            int i = Integer.parseInt(indices[0]);
            int j = Integer.parseInt(indices[1]);
            if (matriz[i][j] == ' ') {
                matriz[i][j] = entry.getValue();
                mostrarMatriz(matriz);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.err.println("Interrupción detectada durante sleep.");
                }
            }
        }

        System.out.println("Resultado final:");
        mostrarMatriz(matriz);
    }

    public static void mostrarMatriz(char[][] matriz) {
        for (char[] fila : matriz) {
            for (char c : fila) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}