package de.telran.summary.lesson15_11082023.synchronization.example3;

public class SynchronizedDemo1 {
    /*

    Модификатор доступа
    synchronized return_type MethodName(parameters() {
    ...}


    Оператор:

    synchronized(reference) {
    //операторы которые мы хотим синхронизировать
    // ....}

     */

    public static void main(String[] args) throws InterruptedException {

        Object objLock = new Object();

        Runnable task = () -> {

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (objLock) {

                System.out.println("Thread: " + Thread.currentThread().getName());

            }

        };

        Thread thread = new Thread(task);
        thread.start();

        Thread.sleep(1);

        synchronized (objLock) {
            for (int i = 0; i < 8; i++) {
                System.out.println(thread.getName() + " is " + thread.getState());
                Thread.currentThread().sleep(1000);
                System.out.println(" " + i);
            }
            System.out.println("...1111.... ");
        }

        Thread.sleep(100);
        System.out.println("...2222.... ");

    }
}
