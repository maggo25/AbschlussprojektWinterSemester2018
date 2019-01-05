public class Eur2Yen extends WR {


    private WR nextWR;
    private final double umrechnungsfaktor= 122.43;

    public Eur2Yen(String name, double betrag)
    {
        this.calcName = name;
        this.betrag = betrag*umrechnungsfaktor;
    }


}

