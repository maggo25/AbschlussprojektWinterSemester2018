public class Eur2Yen extends WR {


    public Eur2Yen()
    {
        this.calcName = "Eur2Yen";
        this.umrechnungsfaktor = 122.43;
    }


    public Eur2Yen(WR wr)
    {
        this.calcName = "Eur2Yen";
        this.umrechnungsfaktor = 122.43;
        this.setWR(wr);
    }




}

