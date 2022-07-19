package Lecture5;

/*
    TODO:
        myMethod() is the name of the method
        static means that the method belongs to the Main class and not an object of the Main class.
        void means that this method does not have a return value.
    */
public class Test {
    static void myMethod() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        myMethod(); // Call a Method
    }
}
//  TODO: Check when you remove static keyword
