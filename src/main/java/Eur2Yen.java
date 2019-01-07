public class Eur2Yen extends WR {


    private String variante;

    //private final double umrechnungsfaktor= 122.43;

    public Eur2Yen(String variante)
    {
        this.calcName = variante;
        //this.betrag = betrag*umrechnungsfaktor;
        this.setUp();
    }

    private void setUp(){
        this.umrechnungsfaktor = 122.43;
        this.variante =  "Eur2Yen";
    }







}

