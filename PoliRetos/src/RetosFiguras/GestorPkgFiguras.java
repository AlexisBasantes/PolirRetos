package RetosFiguras;

import RetosFiguras.RetosF.abFiguras;
import RetosFiguras.RetosF.abRetosFiguras;

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
                abFiguras.retoEscaleraAsteriscos();
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
            abFiguras.retoEscaleraIzquierda();
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
            abFiguras.retoEscaleraNumeros();
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
            abFiguras.retoEscaleraFinal();
                break;
            case 19:
                break;
            default:
                System.out.println("Reto no encontrado");
                break;
        }
    }

}
