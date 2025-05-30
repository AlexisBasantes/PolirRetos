import java.util.Scanner;

import RetosSeries.GestorPkgSeries;
import Utility.Utilitario;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner lecturaDatos = new Scanner(System.in);

        System.out.println("Grupo: 1");
        System.out.println("Integrantes: \n- Amores.Karla\n- Anasi.Eduardo \n- Basantes.Alexis (ba) \n- Burgos.Ariel (ab)\n- Cadena.Steve");
        Utility.Utilitario.imprimirLinea();
        System.out.println("Distribucion de ejercicios:");
        System.out.println("Amores Karla (ak): 1, 6, 11, 16, 21, 26, 31, 36, 41, 46, 51, 56, 61, 66\nAnasi Eduardo (ea): 2, 7, 12, 17, 22, 27, 32, 37, 42, 47, 52, 57, 62, 67\nBasantes Alexis (ba): 3, 8, 13, 18, 23, 28, 33, 38, 43, 48, 53, 58, 63, 68\nBurgos Ariel (ab): 4, 9, 14, 19, 24, 29, 34, 39, 44, 49, 54, 59, 64, 69\nCadena Steve: (cd): 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70");
        Utility.Utilitario.imprimirLinea();
        System.out.println("Nota: el motivo de la presentacion de la distribucion de los ejercicos es por que hubo \nun integrante que no hizo incompletos sus ejercicios y fueron enviados a ultima hora.");
        boolean condicionSalida = false;
        do {
            Utility.Utilitario.imprimirLinea();
            System.out.println("Seleccione el tipo de reto que desea ejecutar:\n");
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
                        Utilitario.imprimirTitulo("Retos de Series");
                        System.out.println("Ingrese el reto de series que desea ejecutar (1 - 21):");
                        int numRetoSeries = lecturaDatos.nextInt();
                        GestorPkgSeries.menuRetosSeries(numRetoSeries);
                        break;
                    case 2:
                        Utilitario.imprimirTitulo("Retos con Figuras");
                        RetosFiguras.GestorPkgFiguras gestorFiguras = new RetosFiguras.GestorPkgFiguras();
                        System.out.println("Ingrese el reto de figuras que desea ejecutar (1 - 19):");
                        int numRetoFiguras = lecturaDatos.nextInt();
                        gestorFiguras.menuRetosFiguras(numRetoFiguras);
                        break;
                    case 3:
                        Utilitario.imprimirTitulo("Retos de Cadenas y Arrays");
                        RetosCadenas.GestorPkgCadenas gestorCadenasArrays = new RetosCadenas.GestorPkgCadenas();
                        System.out.println("Ingrese el reto de cadenas y arrays que desea ejecutar (1 - 14):");
                        int numRetoCadenasArrays = lecturaDatos.nextInt();
                        gestorCadenasArrays.menuRetosCadenasYArrays(numRetoCadenasArrays);
                        break;
                    case 4:
                        Utilitario.imprimirTitulo("Retos Loading");
                        RetosLoading.GestorPkgLoading gestorLoading = new RetosLoading.GestorPkgLoading();
                        System.out.println("Ingrese el reto de loading que desea ejecutar (1 - 12):");
                        int numRetoLoading = lecturaDatos.nextInt();
                        gestorLoading.menuRetosLoading(numRetoLoading);
                        break;
                    case 5:
                        Utilitario.imprimirTitulo("Retos de Recursividad");
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
