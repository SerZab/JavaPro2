package de.telran.javaPro.lesson26_01082023.task1;

import java.util.Date;

public class DateTest2 {

    public static void main(String[] args) {

        Date d1 = new Date(100,7,15); // start from 1900, month from 0 to 11
        Date d2 = new Date();
        Date d3 = new Date(110,3,10);
        Date d4 = new Date(110,3,10);

        boolean result = d2.after(d1);
        System.out.println("Data d2 later than d1 " + result);

        result = d3.before(d1);
        System.out.println("Data d3 later than d1 " + result);

        int res = d1.compareTo(d2);
        System.out.println("Compare d1 later than d2 " + res);

        res = d3.compareTo(d4);
        System.out.println("Compare d3 later than d4 " + res);

        System.out.println(d1.equals(d2));
        System.out.println(d3.equals(d4));

    }
}
