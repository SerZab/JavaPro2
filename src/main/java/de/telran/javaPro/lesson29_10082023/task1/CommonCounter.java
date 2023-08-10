package de.telran.javaPro.lesson29_10082023.task1;

public class CommonCounter {

    private static int counter;

    public static void main(String[] args) {

        Runnable runnable = () -> {
            counter = 0;
            String threadName = Thread.currentThread().getName();
            for (int i = 0; i < 10; i++) {
                counter++;
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println("Ошибка!");
                }
                System.out.printf("Поток: %s, счётчик: %d.%n", threadName, counter);
            }
        };

        Thread threadA = new Thread(runnable);
        Thread threadB = new Thread(runnable);

        threadA.setName("Alpha");
        threadB.setName("Beta");

        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            System.out.println("Ошибка!");
        }
    }
}
