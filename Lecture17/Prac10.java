package Lecture17;

public class Prac10 {
    public static void main(String[] args) {

        char ch = 'a';
        int ascii = ch; // Here is Automatic Casting Done
        // You can also cast char to int
         int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
    }
}
