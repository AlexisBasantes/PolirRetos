package RetosFiguras;

import RetosFiguras.RetosF.abRetosFiguras;
import RetosSeries.RetosS.SerieCuadradosPerfectos;
import RetosSeries.RetosS.SerieS5;
import Utility.Utilitario;

public class GestorPkgFiguras {

    public void menuRetosFiguras(int numRetoFiguras) {
        Utility.Utilitario.imprimirLinea();
        switch (numRetoFiguras) {
            case 1:
                break;
            case 2:
                abRetosFiguras.CuadradoIntercalado();
                break;
            case 3:
                break;          
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:  
                abRetosFiguras.Escalera1();       
                break;
            case 8:
                break;  
            case 9:
                break;          
            case 10:
                break;  
            case 11:
                break;  
            case 12:
                abRetosFiguras.EscaleraNumInvertida();
                break;
            case 13:    
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
                break;
            case 19:    
                break;
            default:
                System.out.println("Reto no encontrado");
                break;
        }
    }

}
