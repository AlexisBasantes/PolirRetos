package RetosFiguras.RetosF;

public class cdFiguras {
    // =======================
// Ejercicio 25: Triángulo de asteriscos alineado a la derecha
// =======================
public static void dc_crearFigura4(int tamanio) {
    System.out.println("\n\nFigura 4: ");
    for (int i = 0; i < tamanio; i++) {
        for (int j = 0; j < tamanio - i - 1; j++) {
            System.out.print("  ");
        }
        for (int k = 0; k < i + 1; k++) {
            System.out.print("* ");
        }
        System.out.println("");
    }
}

// =======================
// Ejercicio 30: Figura tipo árbol
// =======================
public static void dc_crearFigura9(int tamanio) {
    System.out.println("\n\nFigura 8: ");
    int niveles = tamanio;
    for (int i = 1; i <= niveles+1; i++) {
        for (int j = 1; j <= 4 * (niveles+1 - i); j++) {
            System.out.print(" ");
        }
        System.out.print(" ___|");
        System.out.println();
    }
    System.out.println("");
}

// =======================
// Ejercicio 35: Números en forma triangular
// =======================
public static void dc_crearFigura14(int tamanio){
    System.out.println("\nFigura 13:\n");
    for(int fila = 1; fila <= tamanio; fila++){
        for(int columna = 1; columna <= fila; columna++){
            System.out.print(columna);
        }
        System.out.println();
    }
    System.out.println();
}

// =======================
// Ejercicio 40: Triángulo de Pascal modificado
// =======================
public static void dc_crearFigura19(int tamanio) {
    System.out.println("\n\nFigura 18: ");
    int fila = 0, columna = 0;
    int[][] matriz_triangulo = new int [tamanio][tamanio]; 

    for(fila = 0; fila < tamanio; fila++){
        for(columna = 0; columna <= fila; columna++){
            if (fila == columna) {
                matriz_triangulo[fila][columna] = 2;
            }
            if (columna == 0 && fila > 0) {
                matriz_triangulo[fila][columna] = 1;
            }
            if((fila != columna) && columna != 0){
                matriz_triangulo[fila][columna] = matriz_triangulo[fila - 1][columna - 1] + matriz_triangulo[fila - 1][columna]; 
            }
        }
    }

    for(fila = 0; fila < tamanio; fila++){
        for(columna = 0; columna <= fila; columna++){
            System.out.print(matriz_triangulo[fila][columna] + "  ");
        }
        System.out.println("");
    }
}
}
