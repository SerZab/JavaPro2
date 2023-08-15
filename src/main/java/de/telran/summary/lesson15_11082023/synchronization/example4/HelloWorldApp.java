package de.telran.summary.lesson15_11082023.synchronization.example4;

public class HelloWorldApp {
    public static void main(String[] args) throws InterruptedException {

        Object objLock = new Object();

        Runnable task = () -> {

            synchronized (objLock) {

                try {
                    System.out.println("thread started");
                    Thread.sleep(1000);
                    System.out.println("thread finished");
                } catch (InterruptedException e) {}

            }

        };

        Thread thread = new Thread(task);
        thread.start();

        //Thread.sleep(1);

        synchronized (objLock) {
            for (int i = 0; i < 8; i++) {
                System.out.println(thread.getState());
                Thread.currentThread().sleep(1000);
                System.out.println(" " + i);
            }
            System.out.println("....... ");
        }

    }
}


// программа для визуализации потоков JVisualVM или VisualVM
