package RetosFiguras;
import RetosFiguras.RetosF.akRetosFiguras;
import RetosFiguras.RetosF.abFiguras;
import RetosFiguras.RetosF.baRetosFiguras;
import RetosFiguras.RetosF.cdFiguras;
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
                cdFiguras.dc_crearFigura4(5);
                break;
            case 5:
                akRetosFiguras.akFiguraF5(5);
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
                cdFiguras.dc_crearFigura9(5);
                break;
            case 10:
                akRetosFiguras.akFiguraF10(5);
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
                cdFiguras.dc_crearFigura14(5);
                break;
            case 15:
                akRetosFiguras.akFiguraF15(4);
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
                cdFiguras.dc_crearFigura19(5);
                break;
            default:
                System.out.println("Reto no encontrado");
                break;
        }
    }
}

