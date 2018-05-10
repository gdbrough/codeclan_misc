import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    private Radio radio;

    @Before
    public void setUp() {
        radio = new Radio("Sony", "Radio", radio);
    }

    @Test
    public void testCanTune() {
        assertEquals("Tuned to: BBC Radio 2", radio.tune("BBC Radio 2"));
    }

    @Test
    public void testCanPlayRadio() {
        assertEquals("Sony Radio playing",radio.play(radio.displayNameModel()));
    }
}
