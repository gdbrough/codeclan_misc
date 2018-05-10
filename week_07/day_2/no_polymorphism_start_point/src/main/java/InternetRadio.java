public class InternetRadio implements IConnect {

    @Override
    public String connect(String data) {
        return "connected to network: " + data;
    }

    public String tune(String station) {
        return "tuned to: " + station;
    }
}
