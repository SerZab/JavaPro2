package de.telran.javaPro.lesson28_08082023.task2;

public class ThreadSleepTest {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread.sleep(5000);
        long duration = System.currentTimeMillis() - start;
        System.out.printf("затраченное время - %d mc.",duration);
    }
}
