package Lecture2;

public class UnaryOperator2 {
    public static void main(String[] args) {
        int a=10;
        boolean c = true;
        boolean d = false;
        // TODO: opposite of boolean value
        System.out.println(!c);
        System.out.println(!d);

        System.out.println(~a);//-11 (minus of total positive value which starts from 0)
        // TODO: HOW?
        // TODO: Solution: 10 in binary is 0...01010,
        //       so inverted it's 1...10101
        //       which is -11 in the 2's complement representation.
    }
}
