package de.telran.javaPro.lesson29_10082023.task4;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    private static AtomicInteger counter;
    public static void main(String[] args) {
        counter = new AtomicInteger();
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        thread1.start();
        thread2.start();


        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Error");
        }
        System.out.println("Значение счетчика - "+counter);

    }

    public static void increment(){
        counter.incrementAndGet();
    }
}
