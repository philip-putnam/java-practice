import models.User;

public class App {
    public static void main(String[] args) {
        User employee = new User();
        employee.name = "Phil";
        String[] newRoles = { "Birthright", "Help Desk Specialist" };
        System.out.println(newRoles[0]);
        employee.setRoles(newRoles);

        System.out.println( employee.name );
        System.out.println( employee.roles[0] );
    }
}