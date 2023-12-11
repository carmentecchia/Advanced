package Singleton;

public class Main {

    public static void main(String[] args) {
        User user1 = User.getInstance();
        User user2 = User.getInstance();

        System.out.println("User 1:");
        user1.printInfo();


        user2.setNome("Carmen");
        user2.setAge(29);

        System.out.println("\nUser 2:");
        user2.printInfo();

        user1.printInfo();
    }
}
