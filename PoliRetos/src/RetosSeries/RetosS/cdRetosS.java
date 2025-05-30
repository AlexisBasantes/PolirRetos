package RetosSeries.RetosS;

public class cdRetosS {
    public void dc_crearSerie5(int numTerminos) {
    System.out.println("\nSerie Numerica 5:");
    int cont = 0;

    for(int termino = 2; cont < numTerminos; ++termino) {
        if (esPrimo(termino)) {
            System.out.print("" + termino + " ");
            ++cont;
        }
    }
    System.out.println();
}

public static boolean esPrimo(int numero) {
    if (numero <= 1) {
        return false;
    } else {
        for(int i = 2; (double)i <= Math.sqrt((double)numero); ++i) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// =======================
// Ejercicio 10: Potencias de 3
// =======================
public void dc_crearSerie10(int numero_terminos) {
    int resultado = 0;
    System.out.println("\nSerie numérica 10:");

    for(int i = 1; i < numero_terminos; ++i) {
        resultado = (int)Math.pow(3.0, (double)i);
        System.out.print("" + resultado + ", ");
    }

    System.out.print(resultado * 3 + ".");
    System.out.println();
}
}
