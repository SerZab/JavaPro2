package de.telran.summary.lesson15_11082023.synchronization.example2;

public class CommonApp {
    public static void main(String[] args) {
        CommonResource commonResource = new CommonResource();

        for (int i = 1; i < 6; i++) {
            Thread thread = new Thread(new CountThread(commonResource));
            thread.setName("Thread" + i);
            thread.start();
        }
    }
}
