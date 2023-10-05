package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        for (int i = 0; i < left.length; i++) {
        int temp = left[0];
        left[0] = left[left.length - 1];
        left[left.length - 1] = temp;
        temp = right[0];
        right[0] = right[right.length - 1];
        right[right.length - 1] = temp;
        if (left[0] == right[0]) {
            return true;
        }
        }
        return false;
    }
}
