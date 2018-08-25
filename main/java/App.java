import models.User;

public class App {
    public static void main(String[] args) {
        String[] employeeRolls = {"Happy", "Adventurer"};
        User employee = new User("Phil", employeeRolls);
        /* employee.name = "Phil";
        String[] newRoles = { "Birthright", "Help Desk Specialist" };
        System.out.println(newRoles[0]);
         employee.setRoles(newRoles); */

        System.out.println( employee.getName() );
        String[] userRoles = employee.getRoles();

        for (String role : userRoles ) System.out.println(role);
        // System.out.println( employee.roles[0] );
    }
}