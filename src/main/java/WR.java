public abstract class WR implements IUmrechnen {

    protected String calcName;
    protected double betrag;
    private WR nextWR;
    protected double umrechnungsfaktor;

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



    /**
     * Diese Methode rechnet die Beträge um. Falls es die Variante nicht gibt, wird eine Meldung ausgegeben und der returnwert beträgt 0.
     * @param variante Umrechnungsvariante
     * @param betrag Den umzurechnenden Betrag
     * @return die umgerechnete Währung oder 0
     */
    public double umrechnen(String variante, double betrag) {
        double result = 0;
        //Template Hook wird hier angewendet zur vermeidung der Codeduplikate
        if (this.calcName.equals(variante)) {

            result = betrag * this.umrechnungsfaktor;
        } else {
            if (this.nextWR != null) {
                result = nextWR.umrechnen(variante, betrag);
            } else {
                System.out.println("Diese Waehrung kann nicht umgerechnet werden!");
            }
        }
        return result;
    }


    public void write(double betrag) {
        String output = getCalcName() + ": " + betrag;
        System.out.println(output);
    }

}
