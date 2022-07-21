package Lecture7;

public class PrivateModifiersClass {
    private String fname = "saurabh";
    private String lname = "gawade";
    private String email = "saurabh@gmail.com";
    private int age = 24;

    public static void main(String[] args) {
        PrivateModifiersClass myObj = new PrivateModifiersClass();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Email: " + myObj.email);
        System.out.println("Age: " + myObj.age);
    }
}
