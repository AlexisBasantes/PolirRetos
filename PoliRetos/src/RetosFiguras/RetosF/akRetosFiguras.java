package RetosFiguras.RetosF;

public class akRetosFiguras {
    public static String akFiguraF15(int akFilas) {
        StringBuilder akResultado = new StringBuilder();
        for (int akI = 0; akI < akFilas; akI++) {
            int akNumero = 1;
            for (int akJ = 0; akJ <= akI; akJ++) {
                akResultado.append(akNumero).append(" ");
                akNumero = akNumero * (akI - akJ) / (akJ + 1);
            }
            akResultado.append("\n");
        }
        akResultado.append("....");
        return akResultado.toString();
    }

    public static String akFiguraF5(int akFilas) {
        StringBuilder akResultado = new StringBuilder();
        for (int akI = akFilas; akI >= 1; akI--) {
            for (int akJ = 1; akJ <= akI; akJ++) {
                akResultado.append("*");
            }
            akResultado.append("\n");
        }
        return akResultado.toString();
    }

    public static String akFiguraF10(int akFilas) {
        StringBuilder akResultado = new StringBuilder();
        for (int akI = 0; akI < akFilas; akI++) {
            for (int akEsp = 0; akEsp < akI; akEsp++) {
                akResultado.append(" ");
            }
            if (akI % 2 == 0) {
                akResultado.append("+");
            } else {
                akResultado.append("|\n");
                for (int akEsp = 0; akEsp < akI; akEsp++) {
                    akResultado.append(" ");
                }
                akResultado.append("|-");
            }
            akResultado.append("\n");
        }
        for (int akEsp = 0; akEsp < akFilas; akEsp++) {
            akResultado.append(" ");
        }
        akResultado.append("|");
        return akResultado.toString();
    }
}