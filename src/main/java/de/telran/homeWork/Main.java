package de.telran.homeWork;


import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Написать метод, который принимает на вход массив и функцию,
        // обрабатывает каждый элемент массива при помощи этой функции
        // и создаёт и возвращает сет из обработанных элементов.

        String[] words = {"AAA","BBBB","CCCCC","DD"};
        Function<String,String> function = x -> x + " " + x.length();

        Set<String> set = print(words,function);
        System.out.println(set);

    }

    private static Set<String> print(String[] words, Function<String, String> function) {
        Set<String> set = new HashSet<>();
        for (String str : words){
            set.add(function.apply(str));
        }
        return set;
    }


}
