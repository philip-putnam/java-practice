package models;

public class User {
    private String name;
    private String[] roles;

    public User(String newName, String[] newRoles) {
        name = newName;
        roles = newRoles;
    }

    public String getName() {
        return name;
    }

    public String[] getRoles() {
        return roles;
    }
}