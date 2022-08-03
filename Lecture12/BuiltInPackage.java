package Lecture12;
/*
  TODO:  4.Import a Class
            If you find a class you want to use, for example, the Scanner class, which is used to get user input, write the following code:
*/
// TODO: 5. Package With Class:
import java.util.Scanner;
//TODO: In the example above, java.util is a package,
//      while Scanner is a class of the java.util package.

/*
TODO: 6. There are many packages to choose from.
         In the previous example, we used the Scanner class from the java.util package.
         This package also contains date and time facilities, random-number generator and other utility classes.
         To import a whole package, end the sentence with an asterisk sign (*).
         The following example will import ALL the classes in the java.util package:
*/
import java.util.*;

/*
TODO: 1. Built-in Packages:
    The Java API is a library of prewritten classes,
    that are free to use, included in the Java Development Environment.

TODO: 2. The library is divided into packages and classes.
      Meaning you can either import a single class (along with its methods and attributes),
      or a whole package that contain all the classes that belong to the specified package.

TODO: 3. Syntax:
        import package.name.Class;   // Import a single class
        import package.name.*;   // Import the whole package ==> Look at the star
*/
public class BuiltInPackage {
    public static void main(String[] args) {
        System.out.println("");
    }
}
