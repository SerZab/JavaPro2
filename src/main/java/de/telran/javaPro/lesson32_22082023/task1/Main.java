package de.telran.javaPro.lesson32_22082023.task1;

public class Main {

    private static int counter;

    public static void main(String[] args) {

        // Пять потоков. Каждый поток должен увеличить значение
        // общей переменной пять раз, при этом увеличение переменной
        // должно происходить на значение идентификатора данного потока.

        MyThread[] threads = new MyThread[5];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new MyThread(i + 1);
        }

        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Окончательное значение - " + counter);
    }

    public static synchronized void increment(int value) {
        counter += value;
        System.out.println("Новое значение - " + counter);
    }
}