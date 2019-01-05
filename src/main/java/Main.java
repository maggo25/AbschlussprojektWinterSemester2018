public class Main {



    private static WR getChainOfCalculators() {

        WR Eur2Yen = new Eur2Yen("Eur2Yen");
        WR Eur2Dol = new Eur2Dol("Eur2Dol");

        Eur2Yen.setNextWR(Eur2Dol);

        return Eur2Yen;
    }

    public static void main(String[] args) {

        WR wr = getChainOfCalculators();


        System.out.println(wr.umrechnen("Eur2Dol" ,1));

    }
}
