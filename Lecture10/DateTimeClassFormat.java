package Lecture10;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DateTimeClassFormat {
    public static void main(String[] args)
    {
        // Getting the current current time
        Date date = new Date();


        System.out.println("Current Time is : " + date);

        // set format in 12 hours
        SimpleDateFormat formatTime = new SimpleDateFormat("hh.mm aa");
        // hh = hours in 12hr format
        // mm = minutes
        // aa = am/pm

        String time = formatTime.format(
                date); // changing the format of 'date'

        // display time as per format
        System.out.println(
                "Current Time in AM/PM Format is : " + time);
    }
}
