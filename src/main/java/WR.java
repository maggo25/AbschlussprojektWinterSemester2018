public abstract class WR implements IUmrechnen {

    protected String calcName;
    //protected double betrag;
    private WR WR;

    private double betrag;

    protected double umrechnungsfaktor;

    public WR getNextWR() {
        return WR;
    }

    public void setNextWR(WR wr) {
        this.WR = wr;
    }

    public double getBetrag() {
        return betrag;
    }

    public void setBetrag(double betrag) {
        this.betrag = betrag;
    }

    public String getCalcName() {
        return this.calcName;
    }

    public void setCalcName(String calcName) {
        this.calcName = calcName;
    }


    /**
     * Diese Methode rechnet die Beträge um. Falls es die Variante nicht gibt, wird eine Meldung ausgegeben und der returnwert beträgt 0.
     *
     * @param variante Umrechnungsvariante
     * @param betrag   umzurechnender Betrag
     * @return die umgerechnete Währung oder 0
     */
    public double umrechnen(String variante, double betrag) {
        this.betrag = betrag;

        //Template Hook wird hier angewendet zur vermeidung der Codeduplikate
        double result = 0;
        if (this.calcName.equals(variante)) {
            //diese kleine Formel könnte man schöhnheitshalber auch in eine eigene Methode verlagern
            result = betrag * this.getUmrechnungsfaktor();

        } else {
            if (this.WR != null) {
                result = this.WR.umrechnen(variante, betrag);
            } else {
                System.out.println("Diese Waehrung kann nicht umgerechnet werden!");
            }
        }
        return result;
    }


    public abstract double getUmrechnungsfaktor();



    private boolean WRSuchen()
    {
        boolean bool = false;
        if (this.WR != null){
            bool = true;
        }
        return bool;
    }

    /**
     * Hinzufügen eines Währungsrechners am Ende der Kette.
     * Der letzte währungsrechner wird gesucht und diesem wird dann der neue WR als nächsten Währungsrechner eingetragen.
     * @param wr Währungsrechner welcher hinzugefügt werden soll.
     */
    public void addWR(WR wr)
    {
        WR waerungsrechner = this;
        while (waerungsrechner.WRSuchen()){
            waerungsrechner = waerungsrechner.getNextWR();
        }
        waerungsrechner.setNextWR(wr);
    }

    public void deleteWR()
    {

        WR waehrungsrechner = this;
        WR nextwaehrungsrechner = waehrungsrechner;

        while (nextwaehrungsrechner.WRSuchen()){
            waehrungsrechner = nextwaehrungsrechner;
            nextwaehrungsrechner = nextwaehrungsrechner.getNextWR();
        }
        waehrungsrechner.setNextWR(null);
    }

}
