package user;

public class User {
    protected String name;
    protected String surname;
    private String email;
    public static String status = "active";

    public User(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public static String getStatus() {
        return User.status;
    }

    public static void setStatus(String status) {
        User.status = status;
    }

    public void register() {
        System.out.println(this.name + " is registered.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


