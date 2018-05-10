import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InternetRadioTest {

    private InternetRadio internetRadio;

    @Before
    public void setUp() {
        internetRadio = new InternetRadio();
    }

    @Test
    public void testInternetRadioCanConnect(){
        assertEquals("connected to network: CodeClan", internetRadio.connect("CodeClan"));
    }

    @Test
    public void testCanTuneRadio() {
        assertEquals("tuned to: Planet Rock", internetRadio.tune("Planet Rock"));
    }
}
