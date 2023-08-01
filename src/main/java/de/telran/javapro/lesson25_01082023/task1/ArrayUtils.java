package de.telran.javapro.lesson25_01082023.task1;

import java.util.Arrays;

public class ArrayUtils {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getArray(10)));
    }

    public static int[] getArray(int size){
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
        return array;
    }
}
