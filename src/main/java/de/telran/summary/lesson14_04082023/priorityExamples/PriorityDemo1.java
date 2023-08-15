package de.telran.summary.lesson14_04082023.priorityExamples;

public class PriorityDemo1 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Thread.currentThread().setPriority(8); // переопределили приоритет у потока main

        Thread thread = new Thread() {
            public void run() {
                Thread.currentThread().setName("My name");
                System.out.println(Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getPriority());
            }
        };

        thread.start();
    }
}
