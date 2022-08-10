package Lecture14;

class Animal3{
    Animal3(){
        System.out.println("animal is created");
    }
}
class Dog3 extends Animal3{
    Dog3(){
//        super(); // no need to call explicitly
        System.out.println("dog is created");
    }
}
public class SuperBasic3Compare {
    public static void main(String args[]){
        Dog3 d=new Dog3();
    }
}
