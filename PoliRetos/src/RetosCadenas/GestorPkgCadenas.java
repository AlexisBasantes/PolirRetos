package RetosCadenas;

public class GestorPkgCadenas {

    public void menuRetosCadenasYArrays(int numRetoCadenasArrays) {
        switch (numRetoCadenasArrays) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                RetosCadenas.abCadenas.retoEliminarLetra();
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                RetosCadenas.abCadenas.retoCambiarLetras();
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
            RetosCadenas.abCadenas.retoMatrizCuadrada();
                break;
            default:
                System.out.println("Reto no encontrado");
                break;
        }
    }

}
