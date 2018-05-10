public class Turntable extends Component {

    private Turntable turntable;

    public Turntable(String make, String model, Turntable turntable) {
        super(make, model);
        this.turntable = turntable;
    }

    public int selectSpeed(int speed) {
        return speed;
    }
}
