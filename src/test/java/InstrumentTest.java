import instruments.Djembe;
import instruments.MakeType;
import instruments.Saxophone;
import instruments.Synthesiser;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class InstrumentTest {

    Saxophone saxophone;
    Synthesiser synthesiser;
    Djembe djembe;
    MakeType make;

    @Before
    public void setup(){
        saxophone = new Saxophone("Brass", 300,500, MakeType.BUSCHER, "Loudboi100");
        synthesiser = new Synthesiser("Digital", 250, 400, MakeType.KORG, "Mini-Korg");
        djembe = new Djembe("Handmade", 150, 300, MakeType.YAMAHA, "N/A");
    }

    @Test
    public void canGetMake() {
        assertEquals(MakeType.BUSCHER, saxophone.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Loudboi100", saxophone.getModel());
    }

    @Test
    public void instrumentsCanMakeSound(){
        assertEquals(saxophone.play(), "noot noot");
        assertEquals(synthesiser.play(), "Spacey noises");
        assertEquals(djembe.play(), "Doof Doof");

    }

    @Test
    public void canGetMarkUp(){
        assertEquals(150, synthesiser.calculateMarkup());
    }




}
