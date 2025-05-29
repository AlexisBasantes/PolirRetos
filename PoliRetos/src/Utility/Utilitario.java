package Utility;

public class Utilitario {
    public static void imprimirLinea() {
        System.out.println("--------------------------------------------------");
    }

    public static void imprimirTitulo(String titulo) {
        System.out.println("== " + titulo + " ==");
    }

    public static void imprimirSubtitulo(String subtitulo) {
        System.out.println("-- " + subtitulo + " --");
    }

    public static void imprimirMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    public static void limpiarPantalla() {
        // Limpiar pantalla en consola
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
