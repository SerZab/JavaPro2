package de.telran.javaPro.lesson29_10082023.task4;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Main.increment();
        }
    }
}
