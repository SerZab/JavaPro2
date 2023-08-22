package de.telran.javaPro.lesson31_17082023.task2;

import java.util.concurrent.CountDownLatch;

public class CountdownLatchTest {

    public static void main(String[] args) {

        CountDownLatch latch = new CountDownLatch(5);

        new Person("Иван", latch);
        new Person("Пётр", latch);
        new Person("Сидор", latch);
        new Person("Поликарп", latch);
        new Person("Ефистафий", latch);
    }
}
