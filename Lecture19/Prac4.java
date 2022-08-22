package Lecture19;
import java.io.FileInputStream;

public class Prac4 {
    public static void main(String args[]){
        try{
            FileInputStream fin=new FileInputStream("testout1.txt");
            int i=fin.read();
            System.out.print((char)i);

            fin.close();
        }catch(Exception e){System.out.println(e);}
    }
}
