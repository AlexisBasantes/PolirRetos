package RetosCadenas;
import RetosCadenas.RetosC.baRetosCadenas;
import RetosCadenas.RetosC.eaRetosCadenas;
public class GestorPkgCadenas {

    public void menuRetosCadenasYArrays(int numRetoCadenasArrays) {
        switch (numRetoCadenasArrays) {
            case 1:
                break;
            case 2:
                eaRetosCadenas.contarLetrasFrase();
                break;
            case 3:
                baRetosCadenas.eliminarVocalFrase();
                break;
            case 4:
                RetosCadenas.RetosC.abCadenas.retoEliminarLetra();
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                eaRetosCadenas.mostrarFraseMayus();
                break;
            case 8:
                baRetosCadenas.anagrama();
                break;
            case 9:
                RetosCadenas.RetosC.abCadenas.retoCambiarLetras();
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                eaRetosCadenas.graficarFuncionLinealNombre();
                break;
            case 13:
                baRetosCadenas.XApellidoYNombre();
                break;
            case 14:
                break;
            default:
                System.out.println("Reto no encontrado");
                break;
        }
    }

}
