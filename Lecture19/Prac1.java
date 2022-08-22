package Lecture19;

import java.io.IOException;

/*
Java I/O (Input and Output) is used to process the input and produce the output.

Java uses the concept of a stream to make I/O operation fast.
The java.io package contains all the classes required for input and output operations.

We can perform file handling in Java by Java I/O API.


Stream
A stream is a sequence of data. In Java, a stream is composed of bytes.
It's called a stream because it is like a stream of water that continues to flow.

In Java, 3 streams are created for us automatically. All these streams are attached with the console.

1) System.out: standard output stream

2) System.in: standard input stream

3) System.err: standard error stream
*/
public class Prac1 {
    public static void main(String[] args) {
        int i= 0;//returns ASCII code of 1st character
        try {
            i = System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println((char)i);//will print the character
        System.out.println("simple message");
        System.err.println("error message");
    }
}
