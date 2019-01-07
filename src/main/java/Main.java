public class Main {

    public static void main(String[] args) {

        WR Eur2Yen = new Eur2Yen();
        WR Eur2Dol = new Eur2Dol();

        Eur2Yen.setNextWR(Eur2Dol);

        WR wr = Eur2Yen;
        wr = new DecorateUmrecnungsgebuehr(wr);
        wr = new DecorateLogging(wr);


        System.out.println(wr.umrechnen("Eur2Yen" ,100));

    }
}
