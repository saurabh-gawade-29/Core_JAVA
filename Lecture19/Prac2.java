package Lecture19;
import java.io.FileOutputStream;

public class Prac2 {
    public static void main(String args[]){
        try{
            FileOutputStream fout=new FileOutputStream("testout.txt");
            fout.write(65);
            fout.close();
            System.out.println("success...");
        }catch(Exception e){System.out.println(e);}
    }
}
