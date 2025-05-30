package RetosCadenas;

public class akCadenas {

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
}