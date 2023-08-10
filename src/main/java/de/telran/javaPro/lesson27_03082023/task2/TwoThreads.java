package de.telran.javaPro.lesson27_03082023.task2;

import java.util.concurrent.atomic.AtomicInteger;

public class TwoThreads {

    public static int number = 5;
    private static int count = 0;
    public static volatile int count1 = 0;
    public static AtomicInteger count2 = new AtomicInteger(0);

    public static synchronized void increment() {
        count++;
    }

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        MyThread myThread = new MyThread();
        myThread.start();

        for (int i = Integer.MIN_VALUE; i < 0; i++) {
            if (i % number == 0) {
                count2.incrementAndGet();
            }
        }

        try {
            myThread.join();
        } catch (InterruptedException e) {
            System.out.println("Ошибка.");
        }


        long end = System.currentTimeMillis();

        System.out.println("Количество найденных значений - " + count2);
        System.out.println("Затраченное время - " + (end - start) + " мс.");
    }
}