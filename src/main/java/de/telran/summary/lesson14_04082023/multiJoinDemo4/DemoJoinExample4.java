package de.telran.summary.lesson14_04082023.multiJoinDemo4;

import java.util.concurrent.TimeUnit;

public class DemoJoinExample4 {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            try {
                System.out.println(Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                System.out.printf("Interrupted");
            }
        };

        Thread thread = new Thread(task);
        thread.setName("My thread");
        thread.start();
        thread.join();
        System.out.println("Main method is finished!");
    }
}

