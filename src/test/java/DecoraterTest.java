import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DecoraterTest {




    @BeforeEach
    public void setUp()
    {

    }



    @Test
    public void umrechnenTest()
    {
        //ohne Decorator
        WR Eur2Yen = new Eur2Yen();
        double ist = Eur2Yen.umrechnen("Eur2Yen", 100);
        double soll = 12243.0;
        assertEquals(soll , ist);

        //mit Decorator
        Eur2Yen = new DecorateUmrecnungsgebuehr(Eur2Yen);

        ist = Eur2Yen.umrechnen("Eur2Yen", 100);
        soll = 12236.8785;
        assertEquals(soll , ist);
    }







}
