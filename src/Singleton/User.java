package Singleton;

public class User {
    private static User user;
    public static User getInstance(){
        if(user == null){
            user = new User();
        }
        return user;
    }
    private String name;
    private int age;

    //public User() {
       // this.name = "Mario";
        //this.age = 30;
    //}

    public String getName() {
        return name;
    }

    public void setNome(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Nome:" + name + " Età:" + age);

    }
}