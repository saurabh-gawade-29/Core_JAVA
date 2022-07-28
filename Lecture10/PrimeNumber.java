package Lecture10;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        if (checkPrime(num)) {
            System.out.println(num + " is a prime number");
        }
        else
        {
            System.out.println(num + " is not a prime number");
        }
    }
    public static boolean checkPrime(int num)
    {
        if (num <= 1)
        {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++)
        {
            if (num % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
