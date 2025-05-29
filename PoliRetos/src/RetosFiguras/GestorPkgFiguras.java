package RetosFiguras;

public class GestorPkgFiguras {

    public void menuRetosFiguras(int numRetoFiguras) {
        switch (numRetoFiguras) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                System.out.println("Reto 3: Escalera de asteriscos");
                abFiguras.retoEscaleraAsteriscos();
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                System.out.println("Reto 8: Escalera hacia la izquierda");
                abFiguras.retoEscaleraIzquierda();
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
                System.out.println("Reto 13: Escalera de números");
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
                System.out.println("Reto 18: Escalera personalizada");
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
