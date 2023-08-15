package de.telran.summary.lesson14_04082023.multiDemo1;

public class MyFirstThreadDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            MyFirstThread thread = new MyFirstThread();
            thread.start();
        }
    }
}
