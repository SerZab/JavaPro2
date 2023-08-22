package de.telran.javaPro.lesson32_22082023.task4;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphoreA = new Semaphore(1);
        Semaphore semaphoreB = new Semaphore(0);
        Semaphore semaphoreC = new Semaphore(0);

        Thread threadA = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    semaphoreA.acquire();
                    System.out.print("A");
                    semaphoreB.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread threadB = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    semaphoreB.acquire();
                    System.out.print("B");
                    semaphoreC.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread threadC = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    semaphoreC.acquire();
                    System.out.print("C");
                    semaphoreA.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        threadA.start();
        threadB.start();
        threadC.start();
    }
}