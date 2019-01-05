public abstract class WR implements IUmrechnen {

    protected String calcName;
    protected double betrag;
    protected double umzurechnenderbetrag;
    private WR nextWR;

    public WR getNextWR() {
        return nextWR;
    }

    public void setNextWR(WR nextWR){
        this.nextWR = nextWR;
    }

    public String getCalcName() {
        return this.calcName;
    }

    public void setCalcName(String calcName) {
        this.calcName = calcName;
    }

    public double umrechnen(String variante, double betrag) {
        this.umzurechnenderbetrag = betrag;
        if (this.calcName.equals(variante)) {
            write(this.betrag);
        } else {
            if (this.nextWR != null) {
                nextWR.umrechnen(variante, betrag);
            } else {
                System.out.println("Diese Waehrung kann nicht umgerechnet werden!");
            }
        }
        return this.betrag;
    }


    public void write(double betrag) {
        String output = getCalcName() + ": " + betrag;
        System.out.println(output);
    }

}
