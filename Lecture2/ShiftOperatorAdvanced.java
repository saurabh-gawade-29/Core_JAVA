package Lecture2;

public class ShiftOperatorAdvanced {
    public static void main(String[] args) {
        //For positive number, >> and >>> works same
        System.out.println(20>>2); // 20/2^2 = 5
        System.out.println(20>>>2); // 20/2^2 = 5
        //For negative number, >>> changes parity bit (MSB) multiple-bit binary number to 0
        System.out.println(-20>>2); // -5
        System.out.println(-20>>>2); // 1073741819
    }
}
