package de.telran.javaPro.lesson29_10082023.task6;

public class MyThread extends Thread {
//    private Object monitor = new Object();

//    public Object getMonitor() {
//        return monitor;
//    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Main.increment();
        }
    }
}
