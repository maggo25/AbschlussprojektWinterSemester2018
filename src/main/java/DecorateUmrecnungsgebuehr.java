public class DecorateUmrecnungsgebuehr extends Decorator {

    private final double umrechnungsgebuehr = 0.05;

    public DecorateUmrecnungsgebuehr(WR wr) {
        super(wr);
    }

    @Override
    public double umrechnen(String variante, double betrag)
    {
        betrag = betrag - umrechnungsgebuehr;
        return this.waerungsrechner.umrechnen(variante, betrag);
    }

}
