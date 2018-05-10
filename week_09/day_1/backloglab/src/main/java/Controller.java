import spark.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.get;

public class Controller {

    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();

        get("/nextgame", (Request req, Response res) -> {
            ArrayList<String> games = new ArrayList<>();
            games.add("Jet Set Willie");
            games.add("Manic Miner");
            games.add("Horace and the Spiders");
            games.add("Horace Goes Skiing");
            games.add("Jetpac");
            games.add("PSSST");
            Collections.shuffle(games);
            HashMap<String, Object> model = new HashMap<>();
            model.put("result", games.get(0));
            return new ModelAndView(model, "result.vtl");
        }, velocityTemplateEngine);

        Spark.exception(Exception.class, (exception, request, response) -> {
            exception.printStackTrace();
        });
    }
}
