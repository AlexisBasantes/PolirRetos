package RetosCadenas.RetosC;

public class RetosArrays01 {

   
    public int akContarVocales(String akFrase) {
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

    public String akInvertirMayusculas(String akFrase) {
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
}