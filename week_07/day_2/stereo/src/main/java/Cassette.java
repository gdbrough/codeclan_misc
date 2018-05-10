public class Cassette extends Component {

    private Cassette cassette;

    public Cassette(String make, String model, Cassette cassette) {
        super(make, model);
        this.cassette = cassette;
    }

    public String eject() {
        return "Ejected";
    }
}
