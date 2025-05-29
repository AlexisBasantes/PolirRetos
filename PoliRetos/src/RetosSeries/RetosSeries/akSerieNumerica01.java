package RetosSeries;

public class akSerieNumerica01 {

    public static void akSerieNumerica(int i) {
        int n = 8;
        int a = 0, b = 1;

        System.out.println("Serie de Fibonacci:");
        for (int j = 0; j < n; j++) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
    }
}
    
