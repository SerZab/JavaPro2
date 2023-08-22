package de.telran.javaPro.lesson31_17082023.task3;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {

    public static void main(String[] args) {

        CyclicBarrier barrier = new CyclicBarrier(2, new FerryBoat());

        new Truck("Ман", barrier);
        new Truck("Мерседес", barrier);
        new Truck("Скания", barrier);
        new Truck("Вольво", barrier);
        new Truck("Петербилт", barrier);
        new Truck("Ивеко", barrier);
        new Truck("Кенворт", barrier);
        new Truck("Даф", barrier);
    }
}