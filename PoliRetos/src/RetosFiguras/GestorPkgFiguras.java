package RetosFiguras;

public class GestorPkgFiguras {

    public void menuRetosFiguras(int numRetoFiguras) {
        switch (numRetoFiguras) {
            case 5:
                FiguraF5.akMostrarFiguraF5(7); // 7 filas como en tu imagen
                break;
            default:
                System.out.println("Reto de figura no encontrado");
                break;
        }
    }

}
