package Lecture5;
/*
Multidimensional Arrays
A multidimensional array is an array of arrays.
To create a two-dimensional array,
add each array within its own set of curly braces:
*/
public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
//        System.out.println(myNumbers);
//        TODO: How To Access?
        int x = myNumbers[1][2];
        System.out.println(x);
    }
}
