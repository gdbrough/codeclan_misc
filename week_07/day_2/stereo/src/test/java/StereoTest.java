import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    private String make;
    private String model;
    private Integer volume;
    private Radio radio;
    private Cassette cassette;
    private Turntable turntable;
    private Stereo stereo;

    @Before
    public void setUp() {
        radio = new Radio("Sony", "Radio", radio);
        cassette = new Cassette("Sony", "Cassette" , cassette);
        turntable = new Turntable("Sony", "Turnable", turntable);
        stereo = new Stereo("Sony", "Stereo", 3, radio, cassette, turntable);
    }

    @Test
    public void testCanGetStereoName() {
        assertEquals("Sony", stereo.getMake());
    }

    @Test
    public void testCanGetStereoModel() {
        assertEquals("Stereo", stereo.getModel());
    }

    @Test
    public void testCanGetDisplayName() {
        assertEquals("Sony Stereo", stereo.displayName());
    }

    @Test
    public void testCanTuneRadio(){
        assertEquals("Tuned to: Planet Rock", radio.tune("Planet Rock"));
    }

    @Test
    public void testCanPlayCassette() {
        assertEquals("Sony Cassette playing",cassette.play(cassette.displayNameModel()));
    }

    @Test
    public void testCanIncreaseVolume() {
        assertEquals(4, stereo.increaseVolume());
    }

    @Test
    public void testCanDecreaseVolume() {
        assertEquals(2, stereo.decreaseVolume());
    }

    @Test
    public void testCanReturnConnectedComponents(){
        assertEquals("Sony Stereo", stereo.connect());
    }
}
