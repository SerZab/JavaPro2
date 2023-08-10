package de.telran.javaPro.lesson29_10082023.task2;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {

    public static void main(String[] args) {

        AtomicInteger atomic = new AtomicInteger(3);

        System.out.println(atomic);

        // Установка нового значения
        atomic.set(5);
        System.out.println(atomic);

        // "Ленивая" установка нового значения
        // Отличается от обычной установки тем,
        // что другие потоки могут не сразу "увидеть" новое значение
        atomic.lazySet(7);
        System.out.println(atomic);

        // Получение значения
        int value = atomic.get();
        System.out.println("Полученное значение примитивного типа - " + value);

        // Записываем второе значение в переменную,
        // если текущее значение равно первому значению
        boolean result = atomic.compareAndSet(10, 9);
        System.out.println("Произошла ли перезапись значения? - " + result);
        System.out.println("Текущее значение - " + atomic);

        result = atomic.compareAndSet(7, 9);
        System.out.println("Произошла ли перезапись значения? - " + result);
        System.out.println("Текущее значение - " + atomic);

        // Увеличиваем значение на переданный параметр и возвращаем новое значение
        value = atomic.addAndGet(3);
        System.out.println("Примитивное значение - " + value);
        System.out.println("Текущее значение atomic - " + atomic);

        // Сначала возвращает старое значение, а потом увеличивает текущее значение atomic
        value = atomic.getAndAdd(3);
        System.out.println("Примитивное значение - " + value);
        System.out.println("Текущее значение atomic - " + atomic);

        // Увеличиваем значение на единицу и возвращаем новое значение
        value = atomic.incrementAndGet();
        System.out.println("Примитивное значение - " + value);
        System.out.println("Текущее значение atomic - " + atomic);

        // Сначала возвращает старое значение, а потом увеличивает текущее на 1
        value = atomic.getAndIncrement();
        System.out.println("Примитивное значение - " + value);
        System.out.println("Текущее значение atomic - " + atomic);

        // Уменьшаем значение на единицу и возвращаем новое значение
        value = atomic.decrementAndGet();
        System.out.println("Примитивное значение - " + value);
        System.out.println("Текущее значение atomic - " + atomic);

        // Сначала возвращает старое значение, а потом уменьшает текущее на 1
        value = atomic.getAndDecrement();
        System.out.println("Примитивное значение - " + value);
        System.out.println("Текущее значение atomic - " + atomic);

        // Сначала возвращает старое значение, а потом устанавливает новое
        value = atomic.getAndSet(50);
        System.out.println("Примитивное значение - " + value);
        System.out.println("Текущее значение atomic - " + atomic);
    }
}