package Lecture10;
/*
TODO: Leap Year contains 366 days, which comes once every four years. Every leap year corresponds to these facts :
    A century year is a year ending with 00. A century year is a leap year only if it is divisible by 400.
    A leap year (except a century year) can be identified if it is exactly divisible by 4.
    A century year should be divisible by 4 and 100 both.
    A non-century year should be divisible only by 4.
*/
// Importing Classes/Files
import java.io.*;

public class LeapYear {
    // Java program to find a leap year

        // Method to check leap year
        public static void isLeapYear(int year)
        {
            // flag to take a non-leap year by default
            boolean is_leap_year = false;

            // If year is divisible by 4
            if (year % 4 == 0) {
                is_leap_year = true;
                // To identify whether it
                // is a century year or
                // not
                if (year % 100 == 0) {
                    // Checking if year is divisible by 400
                    // therefore century leap year
                    if (year % 400 == 0)
                        is_leap_year = true;
                    else
                        is_leap_year = false;
                }
            }
            // We land here when corresponding if fails
            // If year is not divisible by 4
            else
                // Flag dealing- Non leap-year
                is_leap_year = false;
            if (!is_leap_year)
                System.out.println(year + " : Non Leap-year");
            else
                System.out.println(year + " : Leap-year");
        }

        // Main Driver Code
        public static void main(String[] args)
        {
            // Calling our function by
            // passing century year not divisible by 400
            isLeapYear(2000);

            // Calling our function by
            // passing Non-century year
            isLeapYear(2002);
        }


}
