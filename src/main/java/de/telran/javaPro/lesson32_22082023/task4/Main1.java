package de.telran.javaPro.lesson32_22082023.task4;

public class Main1 {
    private static final Object lock = new Object();
    private static int turn = 1;

    public static void main(String[] args) {
        Thread threadA = new Thread(() -> printLetter('A', 1));
        Thread threadB = new Thread(() -> printLetter('B', 2));
        Thread threadC = new Thread(() -> printLetter('C', 3));

        threadA.start();
        threadB.start();
        threadC.start();
    }

    private static void printLetter(char letter, int targetTurn) {
        for (int i = 0; i < 5;) {
            synchronized (lock){
                if (turn == targetTurn){
                    System.out.println(letter);
                    turn = (turn % 3) + 1;
                    i++;
                }
            }
        }
    }
}
