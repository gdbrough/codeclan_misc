import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TurntableTest {

    private Turntable turntable;

    @Before
    public void setUp() {
        turntable = new Turntable("Sony", "Turnable", turntable);
    }

    @Test
    public void testCanSelectSpeed() {
        assertEquals(45, turntable.selectSpeed(45));
    }
}
