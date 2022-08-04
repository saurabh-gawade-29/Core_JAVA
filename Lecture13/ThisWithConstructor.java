package Lecture13;

class B{
    B(){System.out.println("hello a");}

    B(int x){
//        this(); // you will access contructor with this keyword.
//        System.out.println(x);
    }
}

public class ThisWithConstructor {
    public static void main(String args[]) {
        B b = new B(10);
    }
}