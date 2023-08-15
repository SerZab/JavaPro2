package de.telran.practice.lesson30_15082023;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCount {
    public Map<String, Integer> countWords(String line){
        if( line == null||line.equals("")){
            return Map.of();
        }

        return Arrays.stream(line.split("[,\\s]+"))
                .collect(Collectors.toMap(s -> s, s -> 1, Integer::sum));
    }
}
