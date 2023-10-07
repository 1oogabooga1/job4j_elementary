package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int first = array[0];
        int last = array[array.length - 1];
        while (first <= last) {
           if  (first + last == target) {
               int[] abc = new int[2];
               abc[0] = array[first];
               abc[1] = array[last];
               return abc;
           } else {
               first++;

           }

        last--;
        }
        return new int[0];
    }
}
