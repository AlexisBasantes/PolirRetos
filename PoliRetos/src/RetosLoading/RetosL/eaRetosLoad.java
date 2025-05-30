package RetosLoading.RetosL;
import java.util.Scanner;

public class eaRetosLoad {
  static Scanner sc = new Scanner(System.in);

    public static void eaSimularCarga() {
        System.out.print("Ingrese el carácter para la barra de carga: ");
        char caracter = sc.next().charAt(0);

        System.out.println("\nIniciando carga:");

        int longitudTotal = 20;
        for (int progreso = 0; progreso <= longitudTotal; progreso++) {
            int porcentaje = progreso * 5; // 20 caracteres = 100%

            StringBuilder barra = new StringBuilder("[");
            for (int i = 0; i < longitudTotal; i++) {
                if (i < progreso) {
                    barra.append(caracter);
                } else {
                    barra.append(" ");
                }
            }
            barra.append("] ").append(porcentaje).append("%");

            System.out.print("\r" + barra.toString());
            System.out.flush();

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("\nLa carga fue interrumpida.");
                return; // salir si se interrumpe
            }
        }

        System.out.println("\n\nCarga completada!");
    }

    
public static void eaSimularCargaNombre() {
    System.out.print("Ingrese su nombre y apellidos: ");
    String texto = sc.nextLine();  // Leemos toda la línea (nombre y apellidos)

    int longitud = texto.length();
    int totalPorcentaje = 100;

    System.out.println("\nIniciando carga:");

    for (int i = 1; i <= longitud; i++) {
        String subcadena = texto.substring(0, i);

        int porcentaje = (i * totalPorcentaje) / longitud;

        // \r para sobrescribir la línea anterior
        System.out.print("\r[" + subcadena + "] " + porcentaje + "%");
        System.out.flush();

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            System.out.println("\nCarga interrumpida.");
            return;
        }
    }

    System.out.println("\nCarga completada!");
}

public static void main(String[] args) {
    eaSimularCargaNombre();
}
}

