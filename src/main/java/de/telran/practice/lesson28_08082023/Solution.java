package de.telran.practice.lesson28_08082023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        // тут можно написать код для тестирования
        List<Integer> numbers = Arrays.asList(-1,0,1,2,3,4,5,6,7,81,9,10,101,200);
        printEven(numbers);
        List<String> str = Arrays.asList("hello","java!","and","World!");
        System.out.println(toUpperCase(str));
        System.out.println(sum(numbers));
        System.out.println(getExclamations(str));
        System.out.println(maxBefore100(numbers));
    }

    // Найти все четные числа и вывести их на консоль
    public static void printEven(List<Integer> numbers) {
        numbers.stream().filter(n-> n % 2 == 0 ).forEach(System.out::println);
    }

    // Преобразовать строки в верхний регистр
    public static List<String> toUpperCase(List<String> strings) {
        return strings.stream().map(String::toUpperCase).toList();
    }

    // Просуммировать числа
    public static int sum(List<Integer> numbers) {
        return numbers.stream().reduce(Integer::sum).orElse(0);
    }

    // Вывести только те строки, которые заканчиваются '!' символом
    public static List<String> getExclamations(List<String> strings) {
        return strings.stream().filter(s -> s.endsWith("!")).toList();
    }

    // Найти максимальное число, меньшее 100. Если такого нет, вывести -1
    public static int maxBefore100(List<Integer> numbers) {
        return numbers.stream().filter(n-> n < 100).max(Integer::compareTo).orElse(-1);
    }

}
