package Lecture17;

// TODO: The Unreachable statements refers to statements that won’t get executed during the execution of the program are called Unreachable Statements.
//       These statements might be unreachable because of the following reasons:
//        Have a return statement before them
//        Have an infinite loop before them
//        Any statements after throwing exception in a try block

public class Prac5 {
    public static void main(String args[])
    {

        System.out.println("I will get printed");

        return;

        // it will never run and gives error
        // as unreachable code.
       // System.out.println("I want to get printed"); // un-comment
    }
}
