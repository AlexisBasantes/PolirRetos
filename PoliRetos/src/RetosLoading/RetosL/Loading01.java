package RetosLoading.RetosL;

public class Loading01 {
    public void akIndicadorCarga() throws InterruptedException {
        char[] akAnimacion = {'\\', '|', '/', '-'};
        for (int akPorc = 0; akPorc <= 100; akPorc++) {
            System.out.print("\r" + akAnimacion[akPorc % 4] + " " + akPorc + "%");
            Thread.sleep(50); 
        }
        System.out.println("\nCarga completa!");
    }
}