package de.telran.javaPro.lesson28_08082023.task5;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setRestMoney(1500);
        Client client1 = new Client(account, "Вася");
        Client client2 = new Client(account, "Игорь");
//        client1.run();
//        client2.run();

        client1.start();
        client2.start();
        try {
            client1.join();
            client2.join();
        } catch (InterruptedException ignored) {
        }
        System.out.printf("Rest money %d", account.getRestMoney());
    }
}

