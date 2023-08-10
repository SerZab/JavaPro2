package de.telran.practice.lesson28_08082023;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solutions {
    public static void main(String[] args) {
        // Примеры для тестирования
        List<Product> products = List.of(
                new Product("A", 4.5),
                new Product("B", 3.2),
                new Product("C", 5.0),
                new Product("D", 2.8)
        );

        List<Transaction> transactions = List.of(
                new Transaction(1, Transaction.TransactionStatus.COMPLETED),
                new Transaction(2, Transaction.TransactionStatus.PENDING),
                new Transaction(3, Transaction.TransactionStatus.COMPLETED),
                new Transaction(4, Transaction.TransactionStatus.FAILED)
        );

        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("One", 1);
        originalMap.put("Two", 2);
        originalMap.put("Three", 3);

        // Тестирование методов
        System.out.println("Average Rating: " + averageRating(products));
        Map<Transaction.TransactionStatus, List<Transaction>> transactionStatusListMap = groupByStatus(transactions);
        for (Map.Entry<Transaction.TransactionStatus, List<Transaction>> entry: transactionStatusListMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("Inverted Map: " + invertMap(originalMap));
    }

    // вернуть средний рейтинг продуктов в листе
    public static double averageRating(List<Product> list) {
        return list.stream().mapToDouble(Product::getRating).average().orElse(0);
    }

    // сгруппировать транзакции по статусу
    public static Map<Transaction.TransactionStatus, List<Transaction>> groupByStatus(List<Transaction> transactions) {
        return transactions.stream().collect(Collectors.groupingBy(Transaction::getStatus));
    }

    // нужно инвертировать мапу
    // а что если значения повторяются?
    // а если значение null?
    public static <K, V> Map<V, K> invertMap(Map<K, V> map) {
        if (map == null) {
            throw new IllegalArgumentException("Input map cannot be null");
        }
        return map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue,Map.Entry::getKey));
    }

}
