import models.User;
import static spark.Spark.*;
import spark.template.handlebars.HandlebarsTemplateEngine;
import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

        String[] employeeRolls = {"Happy", "Adventurer"};
        User employee = new User("Phil", employeeRolls);

        System.out.println( employee.getName() );
        String[] userRoles = employee.getRoles();

        for (String role : userRoles ) System.out.println(role);

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("username", request.session().attribute("username"));
            return new ModelAndView(model,"hello.hbs");
            }, new HandlebarsTemplateEngine());

        get( "/form", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "welcome.hbs");
        }, new HandlebarsTemplateEngine());

        get("/data", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String recipient = request.queryParams("recipient");
            String sender = request.queryParams("sender");
            model.put("recipient", recipient);
            model.put("sender", sender);
            return new ModelAndView(model, "data.hbs");
        }, new HandlebarsTemplateEngine());

        post("/welcome", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();

            String inputtedUsername = request.queryParams("username");
            request.session().attribute("username", inputtedUsername);
            model.put("username", inputtedUsername);

            return new ModelAndView(model, "welcome.hbs");
        }, new HandlebarsTemplateEngine());
    }
}