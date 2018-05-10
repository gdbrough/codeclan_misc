import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHolder {
    private Holder john;

    @Before
    public void setUp() throws Exception {
        john = new Holder("John McC", "Codeclan Towers");
    }

    @Test
    public void testName() {
        assertEquals("John McC", john.getName());
    }

    @Test
    public void testAddress() {
        assertEquals("Codeclan Towers", john.getAddress());
    }
}
