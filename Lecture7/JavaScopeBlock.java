package Lecture7;
/*
TODO: Block Scope
    A block of code refers to all the code between curly braces {}.
    Variables declared inside blocks of code are only accessible
    by the code between the curly braces, which follows the line
    in which the variable was declared:
*/
public class JavaScopeBlock {
    public static void main(String[] args) {
    {
//        System.out.println(x);
        int x = 5; // Block Scope
        System.out.println(x);
    }
//        System.out.println(x);
    }
}
