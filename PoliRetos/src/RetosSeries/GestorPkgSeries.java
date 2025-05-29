package RetosSeries;

public class GestorPkgSeries {
    public void menuRetosSeries(int numReto) {
        switch (numReto) {
            case 5:
                SerieS5.akMostrarSerieS5(15);
                break;
            case 6:
                SerieCuadradosPerfectos.akMostrarCuadradosPerfectos(10);
                break;
            case 12:
                SeriesS12.akMostrarSerieS12(10);
                break;
            default:
                System.out.println("Reto no encontrado");
                break;
        }
    }
}