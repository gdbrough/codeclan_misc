import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;

import static spark.Spark.get;
import static spark.SparkBase.staticFileLocation;

public class FlightsController {
    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        staticFileLocation("/public");
        ArrayList<Flight> flights = new ArrayList<>();

        Flight flight = new Flight("SC666", "Scottish Airways","Inverness", "New York");
        Flight flight2 = new Flight("CC999", "Scottish Airways", "Glasgow", "Mumbai");
        Flight flight3 = new Flight("CC141", "Scottish Airways", "Aberdeen", "Dublin");
        Flight flight4 = new Flight("CC927", "Scottish Airways", "Liverpool", "Stirling");

        flight3.setSeatsAvailable(false);
        flights.add(flight);
        flights.add(flight2);
        flights.add(flight3);
        flights.add(flight4);

        get("/flights", (req, res) -> {

            HashMap<String, Object> model = new HashMap<>();
            model.put("flights", flights);
            model.put("template", "flights.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);
    }
}
