package Lecture21;

// Java program to demonstrate BufferedReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Test {
    public static void main(String[] args)
            throws IOException
    {
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        String name = reader.readLine();

        // Printing the read line
        System.out.println(name);
    }
}


// BufferReader has large buffer of 8KB byte Buffer as compared to Scanner.
// Scanner is bit slower as it need to parse data as well.
// BufferReader is faster than Scanner as it only reads a character stream.
// Scanner has methods like nextInt(), nextShort() etc.