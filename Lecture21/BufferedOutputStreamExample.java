package Lecture21;
import java.io.*;

/*
Java BufferedOutputStream class is used for buffering an output stream.
It internally uses buffer to store data.
It adds more efficiency than to write data directly into a stream.
So, it makes the performance fast.
*/

public class BufferedOutputStreamExample {
    public static void main(String args[])throws Exception{
        FileOutputStream fout=new FileOutputStream("G:\\testout.txt"); // E: TestOut ===> it will make a new file
        BufferedOutputStream bout=new BufferedOutputStream(fout);
        String s="Welcome to javaTpoint.";
        byte b[]=s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("success");
    }
}
