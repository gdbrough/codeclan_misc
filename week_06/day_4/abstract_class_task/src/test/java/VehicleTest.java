import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {
    Car car;

    @Before
    public void before(){
        car = new Car(4);
    }

    @Test
    public void getsNumberOfCarWheels(){
        assertEquals(4, car.getWheels());
    }
}
