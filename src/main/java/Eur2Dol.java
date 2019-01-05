public class Eur2Dol extends WR  {


    private WR nextWR;
    public static double umrechnungsfaktor= 1.14;

    public Eur2Dol(String name, double betrag)
    {
        this.calcName = name;
        this.betrag = betrag*umrechnungsfaktor;
    }


}
