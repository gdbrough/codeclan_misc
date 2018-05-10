import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;
    BusStop busstop;

    @Before
    public void before(){
        bus = new Bus("Glasgow", 14);
        person = new Person();
        busstop = new BusStop("Maryhill");
    }

    @Test
    public void busStartsOfEmpty(){
        assertEquals(0, bus.getNumberOfPassengers());
    }

    @Test
    public void busCapacity(){
        assertEquals(14, bus.getCapacity());
    }

    @Test
    public void busDestination(){
        assertEquals("Glasgow", bus.getDestination());
    }

    @Test
    public void addPassengerToBus(){
        bus.addPassenger(person);
        assertEquals(1, bus.getNumberOfPassengers());
    }

    @Test
    public void passengerDisembarks(){
        bus.addPassenger(person);
        assertEquals(1, bus.getNumberOfPassengers());
        bus.removePassenger();
        assertEquals(0, bus.getNumberOfPassengers());
    }

    @Test
    public void passengerCannotBoardFullBus(){
        bus = new Bus("Glasgow", 5);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        busstop.addToQueue(person);
        assertEquals(5, bus.getNumberOfPassengers());
        bus.pickUpPassenger(person, busstop);
        assertEquals(5, bus.getNumberOfPassengers());
        assertEquals(1, busstop.getNumberInQueue());
    }

    @Test
    public void PickUpPassenger(){
        busstop.addToQueue(person);
        assertEquals(1, busstop.getNumberInQueue());
        bus.pickUpPassenger(person, busstop);
        assertEquals(1, bus.getNumberOfPassengers());
        assertEquals(0,busstop.getNumberInQueue());
    }

}
