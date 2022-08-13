package Lecture15;

class Animal{
    void eat(){
        System.out.println("eating...");
    }
}

public class MethodOverRide extends Animal {
    void eat(){
        System.out.println("eating bread...");
    }

    public static void main(String[] args) {
        MethodOverRide obj = new MethodOverRide();
        obj.eat();
//        Animal obj1 = new Animal();
//        obj1.eat();
    }
}
