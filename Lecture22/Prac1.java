package Lecture22;


// TODO: It is used to write an int to the output stream
import java.io.*;
public class Prac1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("testout.txt");
        DataOutputStream data = new DataOutputStream(file);
        data.writeInt(65);
        data.flush();
        data.close();
        System.out.println("Succcess...");
    }
}
