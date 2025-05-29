package RetosFiguras;

public class Figura15{
    public String akFiguraF15(int akFilas) {
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
}