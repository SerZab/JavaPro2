package de.telran.javapro.lesson26_01082023.task1;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) throws InterruptedException {

        Date current = new Date();

        Thread.sleep(200);

        Date current1 = new Date();
        System.out.println(current);
        System.out.println(current1);
        System.out.println(current.getTime());
        System.out.println(current1.getTime());
    }
}
