package de.telran.javaPro.lesson26_01082023.task6;

import java.time.LocalDateTime;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date);

        date = LocalDateTime.of(2005,2,17,8,25,34);
        System.out.println(date);

        date = date.plusHours(6).minusMinutes(3).plusSeconds(15);
        System.out.println(date);
    }
}
