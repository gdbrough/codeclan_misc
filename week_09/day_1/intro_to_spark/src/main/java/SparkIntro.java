import java.util.ArrayList;
import java.util.Collections;

import static spark.Spark.get;

public class SparkIntro {

    public static void main(String[] args) {
        get("/hello", (req, res) -> {
            return "Hello World.";
        });

        get("/randomname", (req, res) -> {
            ArrayList<String> names = new ArrayList<>();
            names.add("Graeme");
            names.add("Jon");
            Collections.shuffle(names);
            return names.get(0);
        });

        get("/hello/:name", (req, res) -> {
            return "Hello " + req.params(":name");
        });

        get("/friends/:number", (req, res) -> {
           String[] friends = {"Jack", "Victor", "Isa", "Winston"};
           int index = Integer.parseInt(req.params(":number"));
           return friends[index];
        });

        get("/add/:firstNumber/:secondNumber", (req, res) -> {
            int primary = Integer.parseInt(req.params(":firstNumber"));
            int secordary = Integer.parseInt(req.params(":secondNumber"));
            return primary + secordary;
        });

    }
}
