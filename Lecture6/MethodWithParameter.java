package Lecture6;

public class MethodWithParameter {
    static void myMethod(String fname) {
        System.out.println(fname + "almeda");
    }

    public static void main(String[] args) {
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");
    }
}
