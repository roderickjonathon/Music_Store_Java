import behaviours.ISell;
import instruments.Djembe;
import instruments.Saxophone;
import instruments.Synthesiser;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ShopTest {

    Shop shop;
    ISell saxophone;
    ISell synthesiser;
    ISell djembe;



    @Before
    public void setup(){
        saxophone = new Saxophone("Brass", 300,500, "Buscher", "Loudboi100");
        synthesiser = new Synthesiser("Digital", 250, 400, "Korg", "Mini-Korg");
        djembe = new Djembe("Handmade", 150, 300, "Custom", "N/A");

        shop = new Shop("Jonny's Noise");
    }

    @Test
    public void shopHasName() {
        assertEquals("Jonny's Noise", shop.getName());
    }

    @Test
    public void canAddItemsToStock() {
        shop.addToStock(saxophone);
       assertEquals(1, shop.getNumOfStockitems());

    }

    @Test
    public void canRemoveItemsFromStock() {
        shop.addToStock(saxophone);
        shop.addToStock(saxophone);
        assertEquals(2, shop.getNumOfStockitems());

        shop.removeFromStock(saxophone);
        assertEquals(1, shop.getNumOfStockitems());
    }

    @Test
    public void canGetTotalProfitofStock(){
        shop.addToStock(saxophone);
        shop.addToStock(synthesiser);
        shop.addToStock(djembe);
        assertEquals(500 ,shop.totalProfit());

    }
}
