package Lecture16;

// Find Position of Char in Given String
public class Prac5 {
    public static void main(String[] args)
    {
        String str = "Swapnil Udaan Educare";
        System.out.println("Original String = " + str);
        // Get the character at positions 0 and 10.
        int index1 = str.charAt(0);
        int index2 = str.charAt(10);

        // Print out the results.
        System.out.println("The character at position 0 is " +
                (char)index1);
        System.out.println("The character at position 10 is " +
                (char)index2);
    }
}
