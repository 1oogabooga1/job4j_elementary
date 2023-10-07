package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int first = 0;
        int last = array.length - 1;
        while (first < array.length) {
            if  (array[first] + array[last] == target) {
               return new int[] {first, last};
           } else if (array[first] + array[last] < target) {
               first++;
            } else {
                last--;
            }
        }
        return new int[0];
    }
}
