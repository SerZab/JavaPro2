package de.telran.javaPro.lesson31_17082023.task1;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {
    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(2);
        new Car("Honda", semaphore);
        new Car("Audi", semaphore);
        new Car("Toyota", semaphore);
        new Car("BMW", semaphore);
    }
}
