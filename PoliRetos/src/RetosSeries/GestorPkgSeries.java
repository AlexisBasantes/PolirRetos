package RetosSeries;

import RetosSeries.RetosS.SerieCuadradosPerfectos;
import RetosSeries.RetosS.akRetosSeries;
import RetosSeries.RetosS.baRetosSeries;
import Utility.Utilitario;
import RetosSeries.RetosS.eaSerieNumerica;
public class GestorPkgSeries {

    public static void menuRetosSeries(int numReto) {
        Utility.Utilitario.imprimirLinea();
        switch (numReto) {
            case 1:
                System.out.println("1. Serie de Fibonacci");
                akRetosSeries.imprimirFibonacci(10);
                break;
            case 2:
                eaSerieNumerica.serieNumerica();
                break;
            case 3:
                baRetosSeries.secuenciaNumericaYFibonacci();  
                break;          
            case 4:
                break;
            case 5:
                akRetosSeries.imprimirS5(20);
                break;
            case 6:
                SerieCuadradosPerfectos.akMostrarCuadradosPerfectos(10);
                break;
            case 7: 
                eaSerieNumerica.serieS7();
                break;
            case 8:
                baRetosSeries.secuenciaMasCinco();
                break;  
            case 9:
                break;          
            case 10:
                break;  
            case 11:
                akRetosSeries.imprimirS11(6);
                break;  
            case 12:   
                eaSerieNumerica.SerieCaracteresS1();
                break;
            case 13: 
                baRetosSeries.secuenciaCaracteres2();
                break;
            case 14:    
                break;
            case 15:    
                break;
            case 16: 
                break;
            case 17:    
                eaSerieNumerica.serieLetrasS6();
                break;
            case 18:  
                baRetosSeries.secuenciaCaracteres7();  
                break;
            case 19:    
                break;
            case 20:
                  
                break;
            case 21:  
                break;
        
            default:
                System.out.println("Reto no encontrado");
                break;
        }
    }

}
