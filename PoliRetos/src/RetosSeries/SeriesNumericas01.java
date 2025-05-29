package RetosSeries;

public class SeriesNumericas01 {

    public String akSerieFibonacci(int akCantidad) {
        StringBuilder akResultado = new StringBuilder();
        int akA = 0, akB = 1;
        for (int akI = 0; akI < akCantidad; akI++) {
            akResultado.append(akA).append(" ");
            int akTemp = akA + akB;
            akA = akB;
            akB = akTemp;
        }
        akResultado.append("...");
        return akResultado.toString();
    }
}