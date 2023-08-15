package de.telran.javaPro.lesson30_15082023.task3;

public class Crossbow {
    private int numberOfArrows;

    public Crossbow(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }

    public synchronized void shoot(){
//        Первый метод должен стрелять по цели каждую секунду, пока стрелы не закончатся,
//                выводить в консоль информацию о каждом выстреле и о том, что стрелы закончились.
//        Затем метод должен выводить информацию о том, что стрелы в колчан добавлены.

        for (int i = numberOfArrows; i >0; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            numberOfArrows--;
            System.out.println("There was a shot! Number of arrows left "+ numberOfArrows);
        }
        System.out.println("There is no arrows left.");
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("The arrows was renewed!");
    }

    public synchronized void fillWithArrows(){
//        Второй метод должен добавлять 10 стрел в колчан и выводить информацию об этом в консоль.
        numberOfArrows += 10;
        System.out.println("The arrows were added!");
        notify();
    }


}

