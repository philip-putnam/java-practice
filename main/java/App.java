import models.User;

public class App {
    public static void main(String[] args) {
        User employee = new User();
        employee.name = "Phil";

        System.out.println( employee.name );
    }
}