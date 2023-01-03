package common.types;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Optional;

public class Dates {
    public static void main(String[] args) {
        // Using your own date format
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            Date myDate = formatter.parse("2017-04-13");
            System.out.println("My custom date: " + myDate);
        } catch (ParseException e) {
            System.out.println("Failed to parse date");
        }

        System.out.println("------------------------------------------------------------");
        // Date manipulation
        System.out.println("Date manipulation using calendar");

        Date date = new Date();
        System.out.println("original: " + date);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        // go back 10 days
        calendar.add(Calendar.DATE, -10);
        System.out.println("10 Days before: " + calendar.getTime());

        // go forward 10 days
        calendar.setTime(new Date());
        calendar.add(Calendar.DATE, 10);
        System.out.println("10 Days after: " + calendar.getTime());
    }
}
