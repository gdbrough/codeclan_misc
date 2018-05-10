public class Mammal extends Animal {

//    private String species;

    public Mammal(String species){
        super(species);
    }

    public String walk(){
        return this.species + " is walking";
    }

}
