package de.telran.summary.lesson14_04082023.dateAndTime;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Date5Example {
    public static void main(String[] args) {


        // получим текущую временную зону

        ZoneId germanyZone = ZoneId.of("Europe/Berlin");

        System.out.println(germanyZone);

        ZoneId asiaZone = ZoneId.of("Asia/Shanghai");

        // получение текущего времени в Германии

        LocalDateTime germanyTime = LocalDateTime.now(germanyZone);

        //  Преобразование времени из Германии в Азию

        LocalDateTime asiaTime = germanyTime.atZone(germanyZone)
                .withZoneSameInstant(asiaZone)
                .toLocalDateTime();

        // вывод текущего времени в азии

        System.out.println("Текущее время в азии " + asiaTime);
        System.out.println(LocalDateTime.now());

    }
}
