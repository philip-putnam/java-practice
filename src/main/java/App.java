import models.User;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        String[] employeeRolls = {"Happy", "Adventurer"};
        User employee = new User("Phil", employeeRolls);


        System.out.println( employee.getName() );
        String[] userRoles = employee.getRoles();

        for (String role : userRoles ) System.out.println(role);

        get("/", (request, response) ->
            "<!DOCTYPE html>" +
                    "<html>" +
                    "<head>" +
                    "<title>Hello Friend!</title>" +
                    "<link rel=stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css' integrity='sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO' crossorigin='anonymous'>" +
                    "</head>" +
                    "<body>" +
                        "<h1>Hello to you!</h1>" +
                    "</body>" +
                    "</html>"
        );
    }
}