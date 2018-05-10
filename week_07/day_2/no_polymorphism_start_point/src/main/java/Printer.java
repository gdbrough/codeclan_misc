public class Printer implements IConnect{

    @Override
    public String connect(String data) {
        return "connected to network: " + data;
    }

    public String print(String data) {
        return "printing: " + data;
    }

}
