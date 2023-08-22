package de.telran.javaPro.lesson31_17082023.task3;

public class FerryBoat implements Runnable {

    private long start = System.currentTimeMillis();

    @Override
    public void run() {
        try {
            System.out.println("Паром отошёл от берега.");
            Thread.sleep(3000);
            System.out.printf("Паром выгрузил автомобили на другом берегу. Время - %d.%n",
                    (System.currentTimeMillis() - start) / 1000);
        } catch (InterruptedException e) {
            System.out.println("Ошибка!");
        }
    }
}
