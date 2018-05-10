import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    Animal animal;

    @Before
    public void before(){
        animal = new Animal("Dog");
    }

    @Test
    public void animalCanBreath(){
        assertEquals("Dog is breathing", animal.breath());
    }

    @Test
    public void animalCanEat(){
        assertEquals("Dog is eating", animal.eat());
    }

}
