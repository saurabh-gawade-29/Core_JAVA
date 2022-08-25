package Lecture20;
import java.io.File;

public class Prac7 {
    public static void main(String[] args) {
        File myObj = new File("Test");
        if (myObj.delete()) {
            System.out.println("Deleted the folder: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the folder.");
        }
    }
}
