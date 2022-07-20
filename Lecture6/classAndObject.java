package Lecture6;
/*
Java Classes/Objects
Java is an object-oriented programming language.
Everything in Java is associated with classes and objects, along with its attributes and methods. For example: in real life, a car is an object. The car has attributes, such as weight and color, and methods, such as drive and brake.
A Class is like an object constructor, or a "blueprint" for creating objects.
*/

// To create a class, use the keyword class:
public class classAndObject {
    int x = 5;

    public static void main(String[] args) {
        classAndObject myObj = new classAndObject();
        System.out.println(myObj.x);
    }
}

// Have You Seen the Diff?? with Static Keyword
