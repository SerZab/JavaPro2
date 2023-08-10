package de.telran.javaPro.lesson27_03082023.task1;

public class Main {
    public static void main(String[] args) {

        // Два базовых способа создания отдельного потока:
        // 1. Использование класса Thread
        // 2. Использование интерфейса Runnable

        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        Thread thread = new Thread(myThread2);

        myThread1.test();

        myThread1.start();
        thread.start();


        for (int i = 0; i < 10; i++) {
            System.out.println("Главный поток: " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Главный поток прерван.");
            }
        }
    }
}
