package de.telran.javapro.lesson26_01082023.task2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest {

    public static void main(String[] args) {

        // Calendar calendar = new GregorianCalendar();
        Calendar calendar = Calendar.getInstance();
        int result = calendar.get(Calendar.YEAR);
        System.out.println("Current year " + result);

        result = calendar.get(Calendar.WEEK_OF_YEAR);
        System.out.println("Current week in this year " + result);

        result = calendar.get(Calendar.MINUTE);
        System.out.println("Current minutes " + result);

        calendar.set(2020,Calendar.APRIL,12, 10, 17, 17);
        result = calendar.get(Calendar.SECOND);
        System.out.println("Second setting " + result);

        calendar.set(Calendar.MONTH,Calendar.NOVEMBER);
        result = calendar.get(Calendar.MONTH);
        System.out.println("Month setting " + result);

        calendar.add(Calendar.MONTH,5);
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);

        System.out.println("new value of month " + month);
        System.out.println("new value of year " + year);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy, HH:mm:ss");
        String formattedDate = formatter.format(calendar.getTime());
        System.out.println("Formatted date " +formattedDate);

        formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        System.out.println("New formatted date " +formatter.format(new Date()));
    }
}
