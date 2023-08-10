package de.telran.javaPro.lesson26_01082023.task4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

//        1. реализовать метод, который принимает год и проверяет на високосность
//        (true, если високосный).

        printFormattedDate(new Date());

//        2. реализовать метод, который принимает дату и выводит в консоль дату,
//        локализованную для Индии.

        System.out.println(isLeapYear(2100));

//        3. реализовать метод, который принимает дату и выводит её в консоль
//        в формате 19-12-22, 19, 353, 11:47 <дата, день месяца, день в году, время>

        printDate(new Date());
    }
    public static void printFormattedDate(Date inputDate){
        Locale locale = new Locale("hi");
        String date = String.format(locale,"%tc",inputDate);
        System.out.println(date);
    }
    public static boolean isLeapYear(int year){
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        return gregorianCalendar.isLeapYear(year);
    }
    public static void printDate(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy, d, D, HH:mm");
        System.out.println(simpleDateFormat.format(date));
    }
}
