import java.util.HashMap;
import java.util.Map;

public class App {

    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4568; //return default port if heroku-port isn't set (i.e. on localhost)
    }
    public static void main(String[] args) {

////Go to Hero Page
//        get("/hero/:id", (req, res) -> {
//            Map<String, Object> model = new HashMap<>();
//            return new ModelAndView(model, "hero.hbs");
//        }, new HandlebarsTemplateEngine());
    }
    }
