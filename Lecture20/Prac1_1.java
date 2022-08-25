package Lecture20;

import java.io.File;
import java.io.IOException;


public class Prac1_1 {
    public static void main(String[] args) {
        try{
            File f = new File("D:\\test.txt");
            if(f.createNewFile()){
                System.out.println("File Created Successfully");
            }else{
                System.out.println("File Already Exist");
            }
        }
        catch (Exception i){
            System.out.println("Exception handle");
        }
    }
}
