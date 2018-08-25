package models;

public class User {
    private String name;
    private String[] roles;

    public User(String newName, String[] newRoles) {
        name = newName;
        for (String s : roles = newRoles) {

        }
    }

    public String getName() {
        return name;
    }

    public String[] getRoles() {
        return roles;
    }

    /* public void setRoles(String[] newRoles)  {
        roles[0] = newRoles[0];
    }
    */
}