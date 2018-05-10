import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MP3PlayerTest {

    private MP3Player mp3Player;

    @Before
    public void setUp() {
        mp3Player = new MP3Player();
    }

    @Test
    public void testCanConnectMP3Player() {
        assertEquals("MP3 Connected", mp3Player.connect());
    }

}
