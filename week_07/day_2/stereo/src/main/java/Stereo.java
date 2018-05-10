public class Stereo implements IConnect {

    private String make;
    private String model;
    private Integer volume;
    private Radio radio;
    private Cassette cassette;
    private Turntable turntable;

    public Stereo(String make, String model, Integer volume, Radio radio, Cassette cassette, Turntable turntable) {
        this.make = make;
        this.model = model;
        this.volume = volume;
        this.radio = radio;
        this.cassette = cassette;
        this.turntable = turntable;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String displayName(){
        return getMake() + " " + getModel();
    }

    public int increaseVolume() {
        return volume += 1;
    }

    public int decreaseVolume() {
        return volume -= 1;
    }

    @Override
    public String connect(){
        return displayName();
    }
}
