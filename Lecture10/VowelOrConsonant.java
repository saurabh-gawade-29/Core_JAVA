package Lecture10;
import java.io.*;

public class VowelOrConsonant {
// java program to check whether input
// character is a vowel or consonant

        // Function to find whether an input
        // character is vowel or not
        static void Vowel_Or_Consonant(char y)
        {
            if (y == 'a' || y == 'e' || y == 'i' || y == 'o'
                    || y == 'u')
                System.out.println("It is a Vowel.");
            else
                System.out.println("It is a Consonant.");
        }

        // The Driver code
        static public void main(String[] args)
        {
            Vowel_Or_Consonant('b');
            Vowel_Or_Consonant('u');
        }
}
