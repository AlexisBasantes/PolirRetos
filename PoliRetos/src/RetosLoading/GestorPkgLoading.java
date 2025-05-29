package RetosLoading;

public class GestorPkgLoading {

    public void menuRetosLoading(int numRetoLoading) {
        switch (numRetoLoading) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.out.println("Reto 5: Barra de progreso animada");
                abLoading.retoBarraProgresoAnimada();
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                System.out.println("Reto 10: Escalones animados");
                abLoading.retoSpinner();
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
