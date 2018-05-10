import java.util.HashMap;

public class HashmapDemo {

    public static void main(String[] args){
        System.out.println("Hello World");

        HashMap<String, String> favouriteFruits = new HashMap<>();
        favouriteFruits.put("John", "pineapple");
        favouriteFruits.put("Emma", "banana");
        favouriteFruits.put("Ellie", "blueberry");

        System.out.println(favouriteFruits.get("Emma"));

        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Dave", 34);
        ages.put("Chas", 54);
        ages.put("Russ", 42);

        System.out.println(ages.get("Chas"));
    }

}
