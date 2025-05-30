package RetosRecursividad;

public class GestorPkgRecurs {

    public void menuRetosRecursividad(int numRetoRecursividad) {
        switch (numRetoRecursividad) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                RetosRecursividad.abRecursividad.retoMultiplicacionRecursiva();
                break;
            case 4:
                break;
            case 5:
                RetosRecursividad.abRecursividad.conteoProgresivoHasta();
                break;
            case 6:
                break;
            default:
                System.out.println("Reto no encontrado");
                break;
        }
    }

}
