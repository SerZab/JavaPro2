package de.telran.summary.lesson14_04082023.multiDemo2;

public class CarUtil {

    public void startThread(){
        var ferrari = new Car("Ferrari");
        Car bmw = new Car("Bmw");

        ferrari.start();
        bmw.start();
    }

}
