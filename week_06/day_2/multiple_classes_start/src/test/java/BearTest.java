import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {

    Bear bear;
    River river;
    Salmon salmon;

    @Before
    public void before(){
        bear = new Bear("Baloo");
        river = new River();
        salmon = new Salmon();
        river.addFish(salmon);
    }

    @Test
    public void bellyStartsEmpty(){
        assertEquals(0, bear.bellySize());
    }

    @Test
    public void bearCanEatSalmon(){
        bear.eat(river);
        assertEquals(1, bear.bellySize());
        assertEquals(0, river.getFishCount());
    }

    @Test
    public void bearCanShitInTheWoods(){
        bear.eat(river);
        assertEquals(1, bear.bellySize());
        bear.shitInTheWoods();
        assertEquals(0,bear.bellySize());
    }

}
