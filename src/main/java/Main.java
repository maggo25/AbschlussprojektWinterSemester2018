public class Main {

    public static void main(String[] args) {

        WR Eur2Yen = new Eur2Yen();
        WR Eur2Dol = new Eur2Dol();

        //Eur2Yen.setWR(Eur2Dol);
        Eur2Yen.addWR(Eur2Dol);

        WR wr = Eur2Yen;
        wr = new DecorateUmrecnungsgebuehr(wr);
        wr = new DecorateLogging(wr);


        System.out.println(wr.umrechnen("Eur2Dol" ,100));

        DAOImplementation dao = new DAOImplementation();
        LoggerEntry ln = new LoggerEntry();

        ln.setBetrag(100);
        ln.setVariante("Test");

        dao.createLogEntry(ln);

    }
}
