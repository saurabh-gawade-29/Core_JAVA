/*
Loops
Loops can execute a block of code as long as a specified condition is reached.

Loops are handy because they save time, reduce errors, and they make code more readable.
* */

package Lecture4;
/*
while (condition) {
  // code block to be executed
}
* */
public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }
}
