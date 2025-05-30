package RetosCadenas.RetosC;

public class akCadenas {

    public static int akContarVocales(String akFrase) {
        int akContador = 0;
        String akVocales = "aeiouAEIOU";
        for (int akI = 0; akI < akFrase.length(); akI++) {
            char akCaracter = akFrase.charAt(akI);
            if (akVocales.indexOf(akCaracter) != -1) {
                akContador++;
            }
        }
        return akContador;
    }

    public static String akInvertirMayusculas(String akFrase) {
        StringBuilder akResultado = new StringBuilder();
        for (int akI = akFrase.length() - 1; akI >= 0; akI--) {
            char akCaracter = akFrase.charAt(akI);
            if (Character.isLetter(akCaracter)) {
                if (Character.isUpperCase(akCaracter)) {
                    akResultado.append(Character.toLowerCase(akCaracter));
                } else {
                    akResultado.append(Character.toUpperCase(akCaracter));
                }
            } else {
                akResultado.append(akCaracter);
            }
        }
        return akResultado.toString();
    }

    public static String akMostrarCarga(String[] akPalabras, int[] akPorcentajes) {
        StringBuilder akResultado = new StringBuilder();
        for (int akI = 0; akI < akPalabras.length; akI++) {
            int akPorc = akPorcentajes[akI];
            int akLongBarra = 15; 
            int akCantLlena = akLongBarra * akPorc / 100;
            akResultado.append("[");
            for (int akJ = 0; akJ < akLongBarra; akJ++) {
                if (akJ < akCantLlena) {
                    akResultado.append("=");
                } else if (akJ == akCantLlena && akPorc > 0 && akCantLlena < akLongBarra) {
                    akResultado.append(">");
                } else {
                    akResultado.append(" ");
                }
            }
            akResultado.append("] ");
            akResultado.append(akPorc).append("% ");
            
            int akLetras = akPalabras[akI].length() * akPorc / 100;
            if (akLetras == 0 && akPorc > 0) akLetras = 1;
            akResultado.append(akPalabras[akI].substring(0, Math.min(akLetras, akPalabras[akI].length())));
            akResultado.append("\n");
        }
        return akResultado.toString();
    }


    

    public static void crearMatrizIniciales(int tamano, char caracter) {
        char[][] matriz;
        matriz = new char[tamano][tamano];
        
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                matriz[i][j] = ' ';
            }
        }
        
        for (int i = 0; i < tamano; i++) {
            matriz[i][0] = caracter;
        }
        
        for (int i = 0; i < tamano; i++) {
            if (i <= tamano / 2) {
                matriz[i][tamano - 1 - i] = caracter;
            } else {
                matriz[i][i] = caracter;
            }
        }
        
        int offset = tamano / 2;
        
        for (int i = 0; i < tamano; i++) {
            matriz[i][offset] = caracter;
            matriz[i][tamano - 1] = caracter;
        }
        
        for (int j = offset; j < tamano; j++) {
            matriz[0][j] = caracter;
            matriz[tamano / 2][j] = caracter;
        }
    }

    public static void mostrarMatriz(char[][] matriz, int tamano) {
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}



