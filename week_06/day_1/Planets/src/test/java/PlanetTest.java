import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlanetTest {

    private Planet planet;

    @Before
    public void before(){
        planet = new Planet("Mars", 1000);
    }

    @Test
    public void planetHasName(){
        assertEquals("Mars", planet.getName());

    }

    @Test
    public void planetHasSize(){
        assertEquals(1000, planet.getSize());
    }

    @Test
    public void planetExplodes(){
        assertEquals("Boom! Mars has exploded.", planet.explode());
    }

}
