package de.telran.javaPro.lesson26_01082023.task3;

import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale locale = new Locale("ru");
        Date now = new Date();
        String date = String.format(locale,"%tc", now);
        System.out.println(date);
    }
}
