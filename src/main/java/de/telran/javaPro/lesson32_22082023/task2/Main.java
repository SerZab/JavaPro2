package de.telran.javaPro.lesson32_22082023.task2;

import java.util.Random;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {

        // Пять потоков. Каждый поток должен увеличить значение
        // общей переменной пять раз, при этом увеличение переменной
        // должно происходить на значение идентификатора данного потока.

//        Runnable runnable = () -> {
//            Random random = new Random();
//            int millis = random.nextInt(4000) + 1000;
//            for (int i = 0; i < 5; i++) {
//                try {
//                    Thread.sleep(millis);
//                    lesson32.task1.Main.increment(id);
//                    System.out.printf("Поток %s увеличил значение на %d.%n", Thread.currentThread().getName(), id);
//                } catch (InterruptedException e) {
//                    System.out.println("Ошибка!");
//                }
//            }
//        };

        Callable<Integer> callable = () -> {
            Thread.sleep(5000);
            int a = 2;
            int b = 3;
            int result = a + b;
            return result;
        };

        ExecutorService service = Executors.newFixedThreadPool(5);
        Future<Integer> future = service.submit(callable);

        int result;
        try {
            result = future.get(3, TimeUnit.SECONDS);
        } catch (Exception e) {
//            throw new RuntimeException(e);
            System.out.println("Получение результата при данных условиях невозможно");
            result = 0;
        }

        service.shutdown();

        System.out.println(result);
    }
}