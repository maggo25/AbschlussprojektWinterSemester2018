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

        DAO dao = new DAO();
        LoggerEntry ln = new LoggerEntry();

        dao.save(ln);

    }
}
