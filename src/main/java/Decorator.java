public abstract class Decorator extends WR {

    protected WR waerungsrechner;

    public Decorator(WR wr) {
        this.waerungsrechner = wr;
    }

    public double umrechnen(String variante, double betrag) {
        return waerungsrechner.umrechnen(variante, betrag);
    }

    @Override
    public double getUmrechnungsfaktor() {
        return this.waerungsrechner.getUmrechnungsfaktor();
    }




}
