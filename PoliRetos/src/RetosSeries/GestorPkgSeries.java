package RetosSeries;


import RetosSeries.RetosS.SerieCuadradosPerfectos;
import RetosSeries.RetosS.SerieS5;
import RetosSeries.RetosS.abRetosSeries;
import RetosSeries.RetosS.eaSerieNumerica;
public class GestorPkgSeries {

    public static void menuRetosSeries(int numReto) {
        Utility.Utilitario.imprimirLinea();
        switch (numReto) {
            case 1:

                break;
            case 2:
                eaSerieNumerica.serieNumerica();
                break;
            case 3:
                abRetosSeries.secuenciaNumericaYFibonacci();
                break;
            case 4:
            abRetosSeries.retoseriesFibonacci();
                break;
            case 5:
                SerieS5.akMostrarSerieS5(15);
                break;
            case 6:
                SerieCuadradosPerfectos.akMostrarCuadradosPerfectos(10);
                break;
            case 7:
                eaSerieNumerica.serieS7();
                break;
            case 8:
                abRetosSeries.secuenciaMasCinco();
                break;
            case 9:
            abRetosSeries.retoPotenciasDeDos();
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                eaSerieNumerica.SerieCaracteresS1();
                break;
            case 13:
                abRetosSeries.secuenciaCaracteres2();
                break;
            case 14:
            abRetosSeries.retoSimbolosIncrementales();
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                abRetosSeries.secuenciaCaracteres7();
                break;
            case 19:
            abRetosSeries.retoLetrasIncrementales();
                break;
            case 20:

                break;
            case 21:
                break;

            default:
                System.out.println("Reto no encontrado");
                break;
        }
    }

}
