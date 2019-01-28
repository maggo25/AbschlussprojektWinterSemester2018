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

        //String variante = "Eur2Dol";
        //double betrag = 100;

        CommandConvert e2d = new CommandConvert(wr, "Eur2Dol",1000);
        e2d.execute();
        CommandConvert e2y = new CommandConvert(wr, "Eur2Yen", 10);
        e2y.execute();




        //System.out.println(wr.umrechnen(variante ,betrag));

        DAOImplementation dao = new DAOImplementation();
        LoggerEntry ln = new LoggerEntry();
        //ln.setBetrag(wr.getBetrag());
        //ln.setVariante(wr.getCalcName());
        ln.setLogentry(e2y.execute());
        dao.createLogEntry(ln);

        LoggerEntry ln2 = new LoggerEntry();
        //ln.setBetrag(wr.getBetrag());
        //ln.setVariante(wr.getCalcName());
        ln2.setLogentry(e2d.execute());
        dao.createLogEntry(ln2);



        List<LoggerEntry> list = dao.getAllLogEvents();

        for (LoggerEntry l : list){
            System.out.println(l.getId() +" | " + l.getLogentry() +" | Datum: " +l.getDateTime());
        }

        //WR Eur2Yennew = new Eur2Yen();
        //WR wrnew = Eur2Yen;
        ISammelrechnung sammelrechnung = new AdapterSammelrechnung(Eur2Yen);
        double[] betraege = {10, 100, 1000};
        double erg = sammelrechnung.sammelumrechnen(betraege, "Eur2Yen");
        System.out.println("Sammelrechnung: "+erg);


    }
}
