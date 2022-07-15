package Lecture4;

// TODO: What is JUMP STATEMENT
/*
Jumping statements are control statements
that transfer execution control from one point to another point in the program.
There are two Jump statements that are provided in the Java programming language:

Break statement. : The break statement can also be used to jump out of a loop.
Continue statement: The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
*/
public class JumpStatementWhenIf {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
//                continue;
            }
            System.out.println(i);
        }
    }
}
