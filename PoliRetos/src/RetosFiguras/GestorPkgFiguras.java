package RetosFiguras;
import RetosFiguras.RetosF.akRetosFiguras;
import RetosFiguras.RetosF.abFiguras;
import RetosFiguras.RetosF.baRetosFiguras;
import RetosFiguras.RetosF.eaRetosfiguras;
public class GestorPkgFiguras {

    public void menuRetosFiguras(int numRetoFiguras) {
        Utility.Utilitario.imprimirLinea();
        switch (numRetoFiguras) {
            case 1:
                eaRetosfiguras.mostrarFiguraF1();
                break;
            case 2:
                baRetosFiguras.CuadradoIntercalado();
                break;
            case 3:
                abFiguras.retoEscaleraAsteriscos();
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                eaRetosfiguras.mostrarFiguraF6();
                break;
            case 7:
                baRetosFiguras.Escalera1();
                break;
            case 8:
            abFiguras.retoEscaleraIzquierda();
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                eaRetosfiguras.mostrarFiguraF11();
                break;
            case 12:
                baRetosFiguras.EscaleraNumInvertida();
                break;
            case 13:
                abFiguras.retoEscaleraNumeros();
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                eaRetosfiguras.mostrarFiguraF16();  
                break;
            case 17:
                baRetosFiguras.adnNumeros();
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

