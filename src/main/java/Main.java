public class Main {



    private static WR getChainOfCalculators() {

        WR Eur2Yen = new Eur2Yen("Eur2Yen", 300);
        WR Eur2Dol = new Eur2Dol("Eur2Dol", 500);

        Eur2Yen.setNextWR(Eur2Dol);

        return Eur2Yen;
    }

    public static void main(String[] args) {

        WR wr = getChainOfCalculators();

        wr.umrechnen("Eur2Yen", 10);
    }
}
