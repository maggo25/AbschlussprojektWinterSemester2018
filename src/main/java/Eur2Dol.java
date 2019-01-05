public class Eur2Dol extends WR {

    /*

    private WR nextWR;
    private final double umrechnungsfaktor= 1.14;

    public Eur2Dol(String variante, double betrag)
    {
        this.calcName = variante;
        this.betrag = betrag*umrechnungsfaktor;
    }

    */

    private WR nextWR;
    private String variante;

    //private final double umrechnungsfaktor= 122.43;

    public Eur2Dol(String variante)
    {
        this.calcName = variante;
        //this.betrag = betrag*umrechnungsfaktor;
        this.setUp();
    }

    private void setUp(){
        //this.calcName = variante;
        this.umrechnungsfaktor = 1.14;
        this.variante =  "Eur2Dol";
    }






}
