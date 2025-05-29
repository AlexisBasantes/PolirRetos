import java.util.Scanner;

import RetosSeries.GestorPkgSeries;
import Utility.Utilitario;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner lecturaDatos = new Scanner(System.in);

        System.out.println("Grupo: 1");
        System.out.println("Integrantes: \n- Amores.Karla\n- Anasi.Eduardo \n- Basantes.Alexis \n- Burgos.Ariel\n- Cadena.Steve");
        boolean condicionSalida = false;
        do {
            Utility.Utilitario.imprimirLinea();
            System.out.println("Ingrese 1 para retos de series");
            System.out.println("Ingrese 2 para retos con figuras");
            System.out.println("Ingrese 3 para retos de cadenas y Arrays"); 
            System.out.println("Ingrese 4 para retos Loading");
            System.out.println("Ingrese 5 para retos de recursividad");
            System.out.println("Ingrese 0 para salir del programa");
            int reto = lecturaDatos.nextInt();
            Utility.Utilitario.imprimirLinea();
            if (reto == 0) {
                condicionSalida = false;
                System.out.println("Saliendo del programa...");
            } else {
                condicionSalida = true;
                switch (reto) {
                    case 1:
                        System.out.println("Ingrese el reto de series que desea ejecutar (1 - 21):");
                        int numRetoSeries = lecturaDatos.nextInt();
                        GestorPkgSeries.menuRetosSeries(numRetoSeries);
                        break;
                    case 2:
                        RetosFiguras.GestorPkgFiguras gestorFiguras = new RetosFiguras.GestorPkgFiguras();
                        System.out.println("Ingrese el reto de figuras que desea ejecutar (1 - 19):");
                        int numRetoFiguras = lecturaDatos.nextInt();
                        gestorFiguras.menuRetosFiguras(numRetoFiguras);
                        break;
                    case 3:
                        RetosCadenas.GestorPkgCadenas gestorCadenasArrays = new RetosCadenas.GestorPkgCadenas();
                        System.out.println("Ingrese el reto de cadenas y arrays que desea ejecutar (1 - 14):");
                        int numRetoCadenasArrays = lecturaDatos.nextInt();
                        gestorCadenasArrays.menuRetosCadenasYArrays(numRetoCadenasArrays);
                        break;
                    case 4:
                        RetosLoading.GestorPkgLoading gestorLoading = new RetosLoading.GestorPkgLoading();
                        System.out.println("Ingrese el reto de loading que desea ejecutar (1 - 12):");
                        int numRetoLoading = lecturaDatos.nextInt();
                        gestorLoading.menuRetosLoading(numRetoLoading);
                        break;
                    case 5:
                        RetosRecursividad.GestorPkgRecurs gestorRecursividad = new RetosRecursividad.GestorPkgRecurs();
                        System.out.println("Ingrese el reto de recursividad que desea ejecutar (1 - 6):");
                        int numRetoRecursividad = lecturaDatos.nextInt();
                        gestorRecursividad.menuRetosRecursividad(numRetoRecursividad);
                        break;

                    default:
                        System.out.println("Tipo de Reto no encontrado");
                }
            }
        } while (condicionSalida);
        
          
    
    
    
    
    }
}
