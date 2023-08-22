package de.telran.javaPro.lesson32_22082023.task2;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main1 {

    private static int id = 0;

    public static synchronized int getId() {
        return ++id;
    }

    public static void main(String[] args) {

        // Пять потоков. Каждый поток должен увеличить значение
        // общей переменной пять раз, при этом увеличение переменной
        // должно происходить на значение идентификатора данного потока.
        // id = 1 -> 1 + 1 + 1 + 1 + 1 = 5
        // id = 2 -> 10
        // 15
        // 20
        // 25

        Callable<Integer> callable = () -> {
            int id = getId();
            int result = 0;
            Random random = new Random();
            int millis = random.nextInt(4000) + 1000;
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(millis);
                    result += id;
                    System.out.printf("Поток %s увеличил значение на %d.%n",
                            Thread.currentThread().getName(), id);
                } catch (InterruptedException e) {
                    System.out.println("Ошибка!");
                }
            }
            return result;
        };

        ExecutorService service = Executors.newFixedThreadPool(5);

        Future<Integer>[] resultBoxes = new Future[6];
        for (int i = 0; i < resultBoxes.length; i++) {
            resultBoxes[i] = service.submit(callable);
        }

        int result = 0;

        for (int i = 0; i < resultBoxes.length; i++) {
            try {
                result += resultBoxes[i].get();
            } catch (Exception e) {
                System.out.println("Ошибка!");
            }
        }

        service.shutdown();

        System.out.println("Результат - " + result);
    }
}