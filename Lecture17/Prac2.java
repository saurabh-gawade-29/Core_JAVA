package Lecture17;

// 1.printStackTrace()–
// This method prints exception information in the format of Name of the exception:
// description of the exception, stack
public class Prac2 {
    public static void main (String[] args) {
        int a=5;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
    }
}
