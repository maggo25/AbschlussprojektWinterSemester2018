import java.util.List;

public class Main {

    public static void main(String[] args) {

        WR Eur2Yen = new Eur2Yen();
        WR Eur2Dol = new Eur2Dol();

        //Eur2Yen.setNextWR(Eur2Dol);

        WR wr = Eur2Yen;
        wr = new DecorateUmrecnungsgebuehr(wr);
        wr = new DecorateLogging(wr);

        Eur2Yen.addWR(Eur2Dol);
        //Eur2Yen.deleteWR();

        String variante = "Eur2Yen";
        double betrag = 100;



        System.out.println(wr.umrechnen(variante ,betrag));

        DAOImplementation dao = new DAOImplementation();
        LoggerEntry ln = new LoggerEntry();

        ln.setBetrag(betrag);
        ln.setVariante(variante);

        dao.createLogEntry(ln);


        List<LoggerEntry> list = dao.getAllLogEvents();

        for (LoggerEntry l : list){
            System.out.println(l.getId() +" | Betrag: "+l.getBetrag() +" | Datum: " +l.getDateTime());
        }

    }
}
