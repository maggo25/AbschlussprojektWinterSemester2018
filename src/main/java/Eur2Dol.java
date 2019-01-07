public class Eur2Dol extends WR {


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
