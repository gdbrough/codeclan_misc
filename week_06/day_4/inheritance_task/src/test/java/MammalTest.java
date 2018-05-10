import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MammalTest {

    Mammal mammal;

    @Before
    public void before(){
        mammal = new Mammal("Bear");
    }

    @Test
    public void mammalCanBreath(){
        assertEquals("Bear is breathing", mammal.breath());
    }

    @Test
    public void mammalCanEat(){
        assertEquals("Bear is eating", mammal.eat());
    }

    @Test
    public void mammalCanWalk(){
        assertEquals("Bear is walking", mammal.walk());
    }



}
