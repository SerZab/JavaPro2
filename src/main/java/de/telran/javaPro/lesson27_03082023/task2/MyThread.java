package de.telran.javaPro.lesson27_03082023.task2;

public class MyThread extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (i % TwoThreads.number == 0) {
                TwoThreads.count2.incrementAndGet();
            }
        }
    }
}
