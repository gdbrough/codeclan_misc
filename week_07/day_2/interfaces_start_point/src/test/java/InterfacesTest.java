import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InterfacesTest {

    Printer printer;
    Mouse mouse;

    @Before
    public void before() {
        printer = new Printer();
        mouse = new Mouse();
    }

    @Test
    public void printerCanConnect() {
        assertEquals("connected", printer.connect());
    }

    @Test
    public void mouseCanConnect() {
        assertEquals("mouse connected", mouse.connect());
    }

    @Test
    public void canPrint() {
        assertEquals("printing: hello world", printer.print("hello world"));
    }

    @Test
    public void canConnectAsPeripheral() {
        IPeripheral printer = new Printer();
        assertEquals("connected", printer.connect());
    }

//    @Test
//    public void canPrintAsPeripheral() {
//        IPeripheral printer = new Printer();
//        assertEquals("printing: hello world", printer.print("hello world"));
//    }
}
