package de.telran.javaPro.lesson28_08082023.task1;

public class Service {

    public static void test(Runnable r){
        r.run();
        new Thread(r).start();
    }
}
