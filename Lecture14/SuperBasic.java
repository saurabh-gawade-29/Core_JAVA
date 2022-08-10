package Lecture14;

/*
TODO:
    The super keyword in Java is a reference variable
    which is used to refer immediate parent class object.
    Whenever you create the instance of subclass,
    an instance of parent class is created implicitly which is referred by super reference variable.
    ===>>> Usage of Java super Keyword
                super can be used to refer immediate parent class instance variable.
                super can be used to invoke immediate parent class method.
                super() can be used to invoke immediate parent class constructor.
*/

class Animal{
    String color="white";
}

class Dog extends Animal{
    String color="black";
    void printColor(){
        System.out.println(color);//prints color of Dog class
        System.out.println(super.color);//prints color of Animal class
    }
}

public class SuperBasic {
    // super is used to refer immediate parent class instance variable.
    public static void main(String[] args) {

            Dog d=new Dog();
            d.printColor();
    }
}
