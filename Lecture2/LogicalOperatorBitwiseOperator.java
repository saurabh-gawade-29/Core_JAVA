package Lecture2;

//  TODO: Java AND Operator Example: Logical && and Bitwise &
//      1. Logical &&
//      The logical && operator doesn't check the second condition if the first condition is false.
//      It checks the second condition only if the first one is true.
//      2. Bitwise &
//      The bitwise & operator always checks both conditions whether first condition is true or false.
public class LogicalOperatorBitwiseOperator {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        int c=20;
        // Logical && vs Bitwise &
        System.out.println(a<b&&a<c);//false && true = false
        System.out.println(a<b&a<c);//false & true = false

        // Logical || vs Bitwise |
        System.out.println(a>b||a<c);//true || true = true
        System.out.println(a>b|a<c);//true | true = true
    }
}
