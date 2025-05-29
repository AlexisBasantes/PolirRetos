package RetosSeries;


import RetosSeries.RetosS.SerieCuadradosPerfectos;
import RetosSeries.RetosS.SerieNumerica02;
import RetosSeries.RetosS.SerieS5;
import RetosSeries.RetosS.abRetosSeries;
import Utility.Utilitario;

public class GestorPkgSeries {

    public static void menuRetosSeries(int numReto) {
        Utilitario.imprimirTitulo("Retos de Series");
        switch (numReto) {
            case 1:
                
                break;
            case 2:
                SerieNumerica02.edSerieNumerica(5); ;
                break;
            case 3:
                abRetosSeries.secuenciaNumericaYFibonacci();  
                break;          
            case 4:
                break;
            case 5:
                SerieS5.akMostrarSerieS5(15);
                break;
            case 6:
                SerieCuadradosPerfectos.akMostrarCuadradosPerfectos(10);
                break;
            case 7: 
                SerieNumerica02.edSerieNumerica(10);        
                break;
            case 8:
                abRetosSeries.secuenciaMasCinco();
                break;  
            case 9:
                break;          
            case 10:
                break;  
            case 11:
                break;  
            case 12:   
                break;
            case 13: 
                abRetosSeries.secuenciaCaracteres2();
                break;
            case 14:    
                break;
            case 15:    
                break;
            case 16:    
                break;
            case 17:    
                break;
            case 18:  
                abRetosSeries.secuenciaCaracteres7();  
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
