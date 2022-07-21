package Lecture7;

// Java program to demsonstrate Infinite Recursion
import java.io.*;

class GFG
{
    // Recursive function
    static void Geek(int N)
    {
        // Base condition
        // This condition is never met here
        if (N == 0)
            return;

        // Print the current value of N
        System.out.print( N +" ");

        // Call itself recursively
        Geek(N);
    }

    // Driver code
    public static void main(String[] args)
    {

        // Initial value of N
        int N = 5;

        // Call the recursive function
        Geek(N);
    }
}

// This code is contributed by shivanisinghss2110
