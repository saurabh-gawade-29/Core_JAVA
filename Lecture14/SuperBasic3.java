package Lecture14;


class Animal2{
    Animal2(){
        System.out.println("animal is created");
    }
}
class Dog2 extends Animal2{
    Dog2(){
        super();
        System.out.println("dog is created");
    }
}


public class SuperBasic3 {
    public static void main(String args[]) {
        Dog2 d = new Dog2();
    }
}


// super keyword is used to access methods of the parent class
// while this is used to access methods of the current class.