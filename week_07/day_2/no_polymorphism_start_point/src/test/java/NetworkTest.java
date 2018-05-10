import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NetworkTest {

    Network network;
    Desktop desktop;
    Printer printer;
    InternetRadio internetRadio;

    @Before
    public void before() {
        network = new Network("CodeClan", 5);
        desktop = new Desktop("Keith's Desktop", "Apple", "Macbook Pro");
        printer = new Printer();
        internetRadio = new InternetRadio();
    }

    @Test
    public void hasName(){
        assertEquals("CodeClan", network.getName());
    }

    @Test
    public void testCanGetMaxConnects(){
        assertEquals(5, network.getMaxConnections());
    }

    @Test
    public void deviceListStartsEmpty() {
        assertEquals(0, network.deviceCount());
    }

    @Test
    public void canConnectDesktop() {
        network.connect(desktop);
        assertEquals(1, network.deviceCount());
    }

    @Test
    public void shouldEmptyDeviceListAfterDisconnectingAll() {
        network.connect(desktop);
        network.disconnectAll();
        assertEquals(0, network.deviceCount());
    }

    @Test
    public void testCanConnectPrinter(){
        network.connect(printer);
        assertEquals(1, network.deviceCount());
    }

    @Test
    public void testCanConnectInternetRadio(){
        network.connect(internetRadio);
        assertEquals(1, network.deviceCount());
    }

    @Test
    public void testCanGetNumberOfEmptyNetworkSlots() {
        network.connect(printer);
        network.connect(desktop);
        assertEquals(3, network.emptySlotCount());
    }

    @Test
    public void testMaximumConnectionsCannotBeBreached() {
        for (int i = 0; i < 3; i++) {
            network.connect(printer);
            network.connect(desktop);
        }
//        network.connect(printer);
//        network.connect(desktop);
//        network.connect(printer);
//        network.connect(desktop);
        assertEquals(5, network.deviceCount());
        assertEquals(0, network.emptySlotCount());
    }
}
