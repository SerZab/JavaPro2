package de.telran.javaPro.lesson31_17082023.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerTest {

    public static void main(String[] args) {

        List<Package> packages1 = new ArrayList<>();
        packages1.add(new Package("A", "C"));
        packages1.add(new Package("A", "D"));

        List<Package> packages2 = new ArrayList<>();
        packages2.add(new Package("B", "C"));
        packages2.add(new Package("B", "D"));

        Exchanger<Package> exchanger = new Exchanger<>();

        Courier courier1 = new Courier("A", "C", packages1, exchanger);
        Courier courier2 = new Courier("B", "D", packages2, exchanger);

        courier1.setAnotherCourier(courier2);
        courier2.setAnotherCourier(courier1);
    }
}
