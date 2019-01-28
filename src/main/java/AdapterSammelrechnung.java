public class AdapterSammelrechnung implements ISammelrechnung {

    private WR wr;

    public AdapterSammelrechnung(WR wr) {
        this.wr = wr;
    }

    @Override
    public double sammelumrechnen(double[] betraege, String variante) {
        double erg = 0;
        for (double betrag : betraege) {
            erg += wr.umrechnen(variante, betrag);
        }
        return erg;
    }
}

