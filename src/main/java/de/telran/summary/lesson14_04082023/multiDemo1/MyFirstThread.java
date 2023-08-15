package de.telran.summary.lesson14_04082023.multiDemo1;

public class MyFirstThread extends Thread{
    @Override
    public void run() {
        System.out.println("I'm Thread! My name is " + getName());
        for (int i = 0; i < 1000000; i++){}

        System.out.println("I'm Thread! My name is " + getName() + " finished!");

    }
}
