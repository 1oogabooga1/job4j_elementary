package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        for (int i = 1; i < data.length; i++) {
            while (data[0] != data[i]) {
                return false;
            }
        }
        return true;
    }
}
