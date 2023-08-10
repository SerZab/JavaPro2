package de.telran.javaPro.lesson28_08082023.task3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        clock.start();

        Thread.sleep(5000);
        clock.interrupt();
    }
}
