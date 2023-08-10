package de.telran.javaPro.lesson26_01082023.task7;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {

        ZonedDateTime date = ZonedDateTime.now();
        System.out.println(date);

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        ZoneId zoneId = ZoneId.systemDefault();

        date = ZonedDateTime.of(localDate,localTime,zoneId);
        System.out.println(date);
    }
}
