package de.telran.javapro.lesson27_03082023.task2;

public class SingleThread {

    public static void main(String[] args) {

        int number = 5;
        int count = 0;

        long start = System.currentTimeMillis();

        for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
            if (i % number == 0) {
                count++;
            }
        }

        long end = System.currentTimeMillis();

        System.out.println("Количество найденных значений - " + count);
        System.out.println("Затраченное время - " + (end - start) + " мс.");
    }
}