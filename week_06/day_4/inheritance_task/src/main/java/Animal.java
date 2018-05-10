public class Animal {

    public String species;

    public Animal(String species){
        this.species = species;
    }

    public String breath(){
        return this.species + " is breathing";
    }

    public String eat(){
        return this.species + " is eating";
    }

}
