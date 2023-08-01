package de.telran.javapro.lesson26_01082023.task5;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDate date1 = LocalDate.of(2023,2,10);
        System.out.println(date1);

        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfYear());

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println(dayOfWeek.ordinal());

        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());

        System.out.println(date.getYear());

        System.out.println("Методы плюс и минус");

        date = date.plusYears(2);
        System.out.println(date);

        date = date.minusMonths(3);
        System.out.println(date);
    }
}
