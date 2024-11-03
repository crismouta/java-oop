package user;

public class MainUser {
    public static void main(String[] args) {
        User user1 = new User("Carolina", "Mouta", "carol@gmail.com");

        user1.register();
        System.out.println("User1 name: " + user1.getName());
        System.out.println("User1 surname: " + user1.getSurname());
        System.out.println("User1 email: " + user1.getEmail() + "\n");

        User user2 = new User("Lucas", "Mouta", "lucas@gmail.com");

        user2.register();
        System.out.println("User2 name: " + user2.getName());
        System.out.println("User2 surname: " + user2.getSurname());
        System.out.println("User2 email: " + user2.getEmail() + "\n");

        user1.setName("Carla");
        System.out.println("User1 name: " + user1.getName());
    }
}
