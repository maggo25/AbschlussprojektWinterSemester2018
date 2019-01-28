import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class WRTest {


    @BeforeEach
    public void before() { }

    @Test
    public void deleteWrTest()
    {
        WR wr = new Eur2Yen();
        assertNull(wr.getNextWR());
        WR test = new Eur2Dol();
        wr.addWR(test);
        assertEquals(test, wr.getNextWR());
        wr.deleteWR();
        assertNull(wr.getNextWR());

    }

    @Test
    public void addWrTest()
    {
        WR test1 = new Eur2Dol();
        WR test2 = new Eur2Yen();
        test1.addWR(test2);
        assertEquals(test2, test1.getNextWR());
    }

    @Test
    public void umrechnenTest()
    {
        WR wr1 = new Eur2Yen();
        double yen = wr1.umrechnen("Eur2Yen", 10);
        assertEquals(1224.3000000000002, yen);

        WR wr2 = new Eur2Dol();
        double dollar = wr2.umrechnen("Eur2Dol", 10);
        assertEquals(11.399999999999999, dollar);
    }


}