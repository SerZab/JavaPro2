package de.telran.javaPro.lesson26_01082023.task1;

import java.util.Date;

public class DateTest1 {
    public static void main(String[] args) {
        Date date = new Date();

        System.out.println(date);

        date.setTime(123857675235667L);

        System.out.println(date);

        Date current = new Date();

        System.out.println(current);

        current.setTime(current.getTime() + 3000);

        System.out.println(current);
    }
}
