package models;

public class User {
    public String name;
    public String[] roles = new String[2];

    public void setRoles(String[] newRoles)  {
        roles[0] = newRoles[0];
    }
}