package de.telran.javaPro.lesson31_17082023.task5;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Exchanger;

public class Courier extends Thread {

    private String start;
    private String destination;
    private List<Package> packages;
    private Courier anotherCourier;
    private boolean inExchangePlace;
    private Exchanger<Package> exchanger;

    public Courier(String start, String destination, List<Package> packages, Exchanger<Package> exchanger) {
        this.start = start;
        this.destination = destination;
        this.packages = packages;
        this.exchanger = exchanger;
        start();
    }

    @Override
    public void run() {
        try {
            Random random = new Random();
            int millis = random.nextInt(9000) + 1000;

            Thread.sleep(millis);
            System.out.printf("%s выехал из точки %s.%n", this, start);

            Thread.sleep(millis);
            System.out.printf("%s доехал до пункта обмена.%n", this);
//            inExchangePlace = true;

            Package relevantPackage = exchanger.exchange(getIrrelevantPackage());
            packages.add(relevantPackage);

//            if (anotherCourier.inExchangePlace) {
//                packages.add(anotherCourier.getIrrelevantPackage());
//            }

            Thread.sleep(millis);

//            if (anotherCourier.inExchangePlace) {
//                packages.add(anotherCourier.getIrrelevantPackage());
//            }

//            inExchangePlace = false;
            System.out.printf("%s уехал из пункта обмена.%n", this);

            Thread.sleep(millis);
            System.out.printf("%s доехал до пункта выгрузки.%n", this);

            Thread.sleep(millis);
            unload();

        } catch (InterruptedException e) {
            System.out.println("Ошибка!");
        }
    }

    public void setAnotherCourier(Courier anotherCourier) {
        this.anotherCourier = anotherCourier;
    }

    private Package getIrrelevantPackage() {
        Iterator<Package> iterator = packages.iterator();
        while (iterator.hasNext()) {
            Package pack = iterator.next();
            if (!destination.equals(pack.getTo())) {
                iterator.remove();
                System.out.printf("%s отдал %s.%n", this, pack);
                return pack;
            }
        }
        return null;
    }

    private void unload() {
        Iterator<Package> iterator = packages.iterator();
        while (iterator.hasNext()) {
            Package pack = iterator.next();
            if (destination.equals(pack.getTo())) {
                iterator.remove();
                System.out.printf("%s успешно доставил %s.%n", this, pack);
            }
        }
        if (packages.isEmpty()) {
            System.out.printf("%s успешно доставил все посылки.%n", this);
        } else {
            System.out.printf("%s не удалось доставить все посылки.%n", this);
        }
    }

    @Override
    public String toString() {
        return String.format("Курьер {%s -> %s}", start, destination);
    }
}
