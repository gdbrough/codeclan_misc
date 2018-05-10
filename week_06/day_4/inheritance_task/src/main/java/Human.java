public class Human extends Mammal {

    public Human(String species){
        super(species);
    }

    public String talk(){
        return "Hello, my name is " + species;
    }

}
