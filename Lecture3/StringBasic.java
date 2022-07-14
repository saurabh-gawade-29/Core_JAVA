package Lecture3;

// Strings are used for storing text.
//Strings are immutable as well.
// Whenever a change to a String is made, an entirely new String is created.
// A String variable contains a collection of characters surrounded by double quotes:

public class StringBasic {
    public static void main(String[] args) {
    //  How to Declare:
        String greeting = "Hello";
        System.out.println(greeting);
    //  How to Find Length of String:
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //26
        System.out.println(alphabets.length());
    //  More String Methods:
    //  1. toUpperCase() and 2. toLowerCase()
        String name = "Swapnil";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
    //  Finding a char in string:
        String txt = "Please Locate 'swapnil' in occurs!";
        System.out.println(txt.indexOf("swapnil")); //15:
        // (IMP: Whitespace: is valid index)
        // TODO: Index Always Starts from 0
    }
}
