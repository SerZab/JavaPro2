package de.telran.javaPro.lesson31_17082023.task2;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class Person extends Thread {

    private CountDownLatch latch;

    public Person(String name, CountDownLatch latch) {
        this.latch = latch;
        setName(name);
        start();
    }

    @Override
    public void run() {
        try {
            long start = System.currentTimeMillis();
            Random random = new Random();
            int millis = random.nextInt(7000) + 1000;

            Thread.sleep(millis);
            System.out.printf("%s вошёл в аэропорт.%n", getName());

            Thread.sleep(millis);
            System.out.printf("%s сдал багаж и зарегистрировался на рейс.%n", getName());

            Thread.sleep(millis);
            System.out.printf("%s прошёл паспортный контроль.%n", getName());

            Thread.sleep(millis);
            System.out.printf("%s совершает посадку в самолёт.%n", getName());

            Thread.sleep(millis);

            latch.countDown();
            latch.await();

            System.out.printf("%s вылетел. Время вылета - %d.%n",
                    getName(), (System.currentTimeMillis() - start) / 1000);
        } catch (InterruptedException e) {
            System.out.println("Ошибка!");
        }
    }
}
