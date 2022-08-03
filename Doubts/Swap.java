package Doubts;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        x = a;
        y = b;
        System.out.println(x);
        System.out.println(y);
        a = y;
        b = x;
        System.out.println(a);
        System.out.println(b);
    }
}
