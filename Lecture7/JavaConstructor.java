package Lecture7;

/*
Java Constructors
A constructor in Java is a special method that is used to initialize objects.
The constructor is called when an object of a class is created.

TODO:
    constructor name must match the class name
    cannot have a return type (like void)
    constructor is called when the object is created
*/

public class JavaConstructor {
    int x;  // Create a class attribute

    // Create a class constructor for the Main class
    public JavaConstructor() {
        x = 5;  // Set the initial value for the class attribute x
        System.out.println("This Special Method Call Automatic when object is Created");
    }

    public static void main(String[] args) {
        JavaConstructor myObj = new JavaConstructor(); // Create an object of class Main (This will call the constructor)
        System.out.println(myObj.x); // Print the value of x
    }
}
