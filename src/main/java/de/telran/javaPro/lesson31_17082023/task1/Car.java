package de.telran.javaPro.lesson31_17082023.task1;

import java.util.concurrent.Semaphore;

public class Car extends Thread {

    private Semaphore semaphore;

    public Car(String name, Semaphore semaphore) {
        this.semaphore = semaphore;
        setName(name);
        start();
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.printf("Автомобиль %s на старте.%n", getName());

            long start = System.currentTimeMillis();
            Thread.sleep(3000);
            System.out.printf("Автомобиль %s начал движение.%n", getName());

            Thread.sleep(3000);
            System.out.printf("Автомобиль %s подъехал к тоннелю.%n", getName());

            Thread.sleep(3000);
            semaphore.acquire();
            System.out.printf("Автомобиль %s въехал в тоннель.%n", getName());

            Thread.sleep(3000);
            System.out.printf("Автомобиль %s покинул тоннель.%n", getName());
            semaphore.release();

            Thread.sleep(3000);
            System.out.printf("Автомобиль %s финишировал за %d с.%n",
                    getName(), (System.currentTimeMillis() - start) / 1000);
        } catch (InterruptedException e) {
            System.out.println("Ошибка!");
        }
    }
}
