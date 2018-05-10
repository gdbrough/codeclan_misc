public class Radio extends Component {

    private Radio radio;

    public Radio(String make, String model, Radio radio) {
        super(make, model);
        this.radio = radio;
    }

    public String tune(String station){
        return "Tuned to: " + station;
    }

}
