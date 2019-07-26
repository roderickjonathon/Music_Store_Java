import org.junit.Before;
import org.junit.Test;
import saleItems.Drumsticks;
import saleItems.Plectrum;
import saleItems.Strings;

import static junit.framework.TestCase.assertEquals;

public class SaleItemTest {

    Drumsticks drumsticks;
    Plectrum plectrum;
    Strings strings;

    @Before
    public void setup(){
        drumsticks = new Drumsticks("Accessory", 10, 15);
        plectrum = new Plectrum("Accessory", 1, 2);
        strings = new Strings("Accessory", 3, 6);
    }

    @Test
    public void saleItemsHaveMarkup() {
        assertEquals(5, drumsticks.calculateMarkup());
        assertEquals(1, plectrum.calculateMarkup());
        assertEquals(3, strings.calculateMarkup());

    }
}
