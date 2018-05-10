import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    Bus bus;
    Person person;
    BusStop busstop;

    @Before
    public void before(){
        busstop = new BusStop("Maryhill");
    }

    @Test
    public void busStopQueueStartsOfEmpty(){
        assertEquals(0, busstop.getNumberInQueue());
    }

    @Test
    public void addPersonToQueue(){
        busstop.addToQueue(person);
        assertEquals(1, busstop.getNumberInQueue());
    }

    @Test
    public void removePersonFromQueue(){
        busstop.addToQueue(person);
        assertEquals(1, busstop.getNumberInQueue());
        busstop.removeFromQueue();
        assertEquals(0, busstop.getNumberInQueue());
    }

}
