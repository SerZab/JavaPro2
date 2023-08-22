package de.telran.practice.lesson32_22082023;

public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread(1, 100);
        MyThread thread2 = new MyThread(101, 200);
        MyThread thread3 = new MyThread(201, 300);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int totalSum = thread1.getSum() + thread2.getSum() + thread3.getSum();
        System.out.println(" Общая сумма: " + totalSum);
    }
}