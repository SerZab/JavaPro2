package de.telran.javaPro.lesson28_08082023.task4;

public class Main {
    public static void main(String[] args) {

        MyThread thread = new MyThread();
        thread.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException ignored) {
        }

        thread.stopThread();
    }
}
