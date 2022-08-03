package Lecture12;
/*
TODO: Java try and catch
    1. The try statement allows you to define a block of code
    to be tested for errors while it is being executed.
    2. The catch statement allows you to define a block of code to be executed,
    if an error occurs in the try block.
    3. The try and catch keywords come in pairs:
*/
public class TryCatch {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
//            System.out.println(e); // Your Error is here in e
            System.out.println("Something went wrong.");
        }
    }
}
