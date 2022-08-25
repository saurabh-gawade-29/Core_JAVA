package Lecture20;

import java.io.File;
import java.io.IOException;

public class Prac1 {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\test.txt");
        if(f.createNewFile()){
            System.out.println("File Created Successfully");
        }else{
            System.out.println("File Already Exist");
        }
    }
}
