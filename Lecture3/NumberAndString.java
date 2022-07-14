package Lecture3;

//WARNING!
//Java uses the + operator for both addition and concatenation.
//Numbers are added. Strings are concatenated.

public class NumberAndString {
    public static void main(String[] args) {
        // If You add two Number then Result will be a Number
        int x = 10;
        int y = 10;
        int z = x + y;
        System.out.println("The Addition of two numbers: "+ z);
    //  TODO: What will be the output for blank Print Statement for JAVA:
        System.out.println();
    //  But: add two strings, the result will be a string concatenation:
        String a = "10";
        String b = "10";
        String c = a + b;
        System.out.println("The Addition of String: "+ c);
    //  Must See the Output: 1020
    //  TODO: But Now Addition of Sting and Int will be what????
        String e = "10";
        int f = 10;
        String g = e + f;
        System.out.println("Addition of String and Int: "+ g);
    //  Let's Find!!!!!!!
    }
}
