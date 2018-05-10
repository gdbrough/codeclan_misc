import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void setUp() {
        printer = new Printer();
    }

    @Test
    public void testCanPrint() {
        assertEquals("printing: hello world", printer.print("hello world"));
    }

    @Test
    public void testPrinterCanConnect(){
        assertEquals("connected to network: CodeClan", printer.connect("CodeClan"));
    }
}
