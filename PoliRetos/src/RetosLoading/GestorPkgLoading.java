package RetosLoading;
import RetosLoading.RetosL.baRetosLoading;
import RetosLoading.RetosL.eaRetosLoad;
public class GestorPkgLoading {

    public void menuRetosLoading(int numRetoLoading) {
        switch (numRetoLoading) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                eaRetosLoad.eaSimularCarga();
                break;
            case 4:
                baRetosLoading.movimientoCarga();
                break;
            case 5:
                RetosLoading.abLoading.retoLoading();

                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                eaRetosLoad.eaSimularCargaNombre();
                break;  
            case 9:
                baRetosLoading.cargaConNombre();
                break;
            case 10:
                RetosLoading.abLoading.retoSpinner();
                break;
            case 11:
                break;
            case 12:
                break;
            default:
                System.out.println("Reto no encontrado");
                break;
        }
    }

}
