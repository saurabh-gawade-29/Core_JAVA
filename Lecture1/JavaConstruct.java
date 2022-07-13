package Lecture1;// ! Name of this file will be "JavaConstruct.java"

public class JavaConstruct {
    /*
     * Author: Saurabh Gawade
     * Date: 2022-07-12
     * Description:
     * Writes the words "Hello Java" on the screen
     */
    public static void main(String[] args) {
        System.out.println("Hello Java");
    }
}

/*
 * Let's Look into Various Parts of the Above Java Program
 * 
 * ===> public class JavaConstruct:
 * 1. This creates a class called JavaConstruct.
 * 2. All class names must start with a capital letter.
 * 3. The public word means that it is accessible from any otherclasses.
 * 
 * ===> Comments:
 * 1. The compiler ignores comment block. Comment can be usedanywhere in the
 * program to add info about the program or code block
 * 2. which will be helpful for developers to understand theexisting code in the
 * future easily.
 * 
 * ===> Braces:
 * 1. Two curly bracketsare used to group all the commands, so itis
 * known that the commands belong to that class or method.
 * 
 * ===> public static void main:
 * 1. When the main method is declared public, it means that it can also be used
 * by code outside of its class, due to which the main method is declared
 * public.
 * 2. The word static used when we want to access a method without creating its
 * object, as we call the main method, before creating any class objects.
 * 3. The word void indicates that a method does not return a value. main() is
 * declared as void because it does not return avalue.
 * 4. main is a method; this is a starting point of a Java program.
 * 5. It is an array where each element of it is a string, which has
 * been named as "args". If your Java program is run through the
 * console,you can pass the input parameter, and main() method takes
 * it as input.
 * 
 * ===> System.out.println(); :
 * 1. This statement is used to print text on the screen as output,
 * where the system is a predefined class, and out is an object of the
 * Print Writer class defined in the system. The method println printsthe text
 * on the screen with a new line. You can also use print() method instead of
 * println() method. All Java statement ends with a semicolon.
 */