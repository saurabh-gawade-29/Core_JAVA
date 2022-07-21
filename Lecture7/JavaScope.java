package Lecture7;

/*
Method Scope:
Variables declared directly inside a method are available anywhere
in the method following the line of code in which they were declared:
*/
public class JavaScope {
    public static void main(String[] args) {
//        System.out.println(x);
        int x = 100;
//        System.out.println(x);
    }
}
