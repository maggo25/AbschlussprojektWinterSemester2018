public class Main {



    private static WR waehrungsRechner() {

        WR Eur2Yen = new Eur2Yen("Eur2Yen", 50);
        WR Eur2Dol = new Eur2Dol("Eur2Dol", 300);

        Eur2Yen.setNextWR(Eur2Dol);

        return Eur2Yen;
    }

    public static void main(String[] args) {

        WR wr = waehrungsRechner();

        wr.umrechnen("Eur2Yen", 50);
    }
}
