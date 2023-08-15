package de.telran.summary.lesson14_04082023.dateAndTime;

import java.util.Date;

public class Date2Example {
    public static void main(String[] args) {
        Date date1 = new Date(0,11,21);
        Date date2 = new Date();
        Date date3 = new Date(110,1,3);

        System.out.println("Date1 represented is  " + date1);
        System.out.println("Date2 represented is  " + date2);
        System.out.println("Date3 represented is  " + date3);

        boolean isAfter = date3.after(date2);
        System.out.println("Date " + date3 + " comes after " + date2 + " is " + isAfter);

        isAfter = date3.after(date1);
        System.out.println("Date " + date3 + " comes after " + date1 + " is " + isAfter);


        int millis = date2.compareTo(date3);

        System.out.println(millis);

        System.out.println("Milliseconds from 1 Jan 1970 to date " + date2 + " is " + date2.getTime());


    }
}
