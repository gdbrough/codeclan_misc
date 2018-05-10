import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CassetteTest {

    private Cassette cassette;

    @Before
    public void setUp() throws Exception {
        cassette = new Cassette("Sony", "Cassette", cassette);
    }

    @Test
    public void testCanGetMake() {
        assertEquals("Sony",cassette.getMake());
    }

    @Test
    public void testCanGetModel(){
        assertEquals("Cassette", cassette.getModel());
    }

    @Test
    public void testCanDisplayMakeModel(){
        assertEquals("Sony Cassette", cassette.displayNameModel());
    }

    @Test
    public void testCanPlayCassette() {
        assertEquals("Sony Cassette playing",cassette.play(cassette.displayNameModel()));
    }

    @Test
    public void testCanEject() {
        assertEquals("Ejected", cassette.eject());
    }
}
