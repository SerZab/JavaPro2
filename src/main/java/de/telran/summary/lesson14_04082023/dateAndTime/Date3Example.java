package de.telran.summary.lesson14_04082023.dateAndTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Date3Example {
    public static void main(String[] args) {
        //get()

        GregorianCalendar day = new GregorianCalendar(2022, Calendar.DECEMBER, 20);
        int month = day.get(Calendar.MONTH);
        System.out.println(month);


        //set()

        day.set(1976,Calendar.FEBRUARY, 28);
        System.out.println(day.get(Calendar.MONTH));


        // add()

        day = new GregorianCalendar(1975, Calendar.DECEMBER, 31);
        day.add(Calendar.MONTH,2);
        //System.out.println(day);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String dateString = formatter.format(new Date());
        System.out.println(dateString);

        Calendar calendar = Calendar.getInstance();
        formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateString = formatter.format(calendar.getTime());
        System.out.println(dateString);


    }
}
