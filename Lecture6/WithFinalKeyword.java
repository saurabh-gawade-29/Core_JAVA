package Lecture6;

/*
* The final keyword is useful when you want a variable
*  to always store the same value, like PI (3.14159...)
* */
public class WithFinalKeyword {
//    final int x = 10;
    int x = 10; // Comment this and uncomment Above
    public static void main(String[] args) {
        WithFinalKeyword myObj = new WithFinalKeyword();
        myObj.x = 25; // will generate an error: cannot assign a value to a final variable
        System.out.println(myObj.x);
    }
}
