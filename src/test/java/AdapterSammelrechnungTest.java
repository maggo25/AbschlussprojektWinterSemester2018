import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class AdapterSammelrechnungTest {


    private AdapterSammelrechnung sammelumrechner;
    private WR mockWr = Mockito.mock(WR.class);

    @BeforeEach
    public void before() {
        this.sammelumrechner = new AdapterSammelrechnung(mockWr);

    }

    @Test
    public void sammelumrechnen() {
        double[] betraege = {1, 2 , 3};
        when(mockWr.umrechnen("test", 1)).thenReturn(2.0);
        when(mockWr.umrechnen("test", 2)).thenReturn(4.0);
        when(mockWr.umrechnen("test", 3)).thenReturn(6.0);
        Double result =sammelumrechner.sammelumrechnen(betraege, "test");
        assertEquals((Double)12.0, result);
    }

}
