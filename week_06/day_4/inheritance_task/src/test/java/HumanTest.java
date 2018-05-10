import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HumanTest {
    Human human;

    @Before
    public void before(){
        human = new Human("Graeme");
    }

    @Test
    public void humanCanBreath(){
        assertEquals("Graeme is breathing", human.breath());
    }

    @Test
    public void humanCanEat(){
        assertEquals("Graeme is eating", human.eat());
    }

    @Test
    public void humanCanWalk(){
        assertEquals("Graeme is walking", human.walk());
    }

    @Test
    public void humanCanTalk(){
        assertEquals("Hello, my name is Graeme", human.talk());
    }


}
