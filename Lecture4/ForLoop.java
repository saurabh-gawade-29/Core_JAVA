package Lecture4;

/*
When you know exactly how many times you want to loop through a block of code,
use the for loop instead of a while loop:
* */
public class ForLoop {
    /*
    for (statement 1; statement 2; statement 3) {
        // code block to be executed
    }

    Statement 1 is executed (one time) before the execution of the code block.

    Statement 2 defines the condition for executing the code block.

    Statement 3 is executed (every time) after the code block has been executed.
    * */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}


// TODO: We will see for Each Loop in Next Lecture