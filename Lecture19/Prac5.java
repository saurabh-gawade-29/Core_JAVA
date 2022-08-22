package Lecture19;
import java.io.FileInputStream;

public class Prac5 {
    public static void main(String args[]){
        try{
            FileInputStream fin=new FileInputStream("testout1.txt");
            int i=0;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
            fin.close();
        }catch(Exception e){System.out.println(e);}
    }
}
