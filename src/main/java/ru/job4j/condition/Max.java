package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int rsl = left > right ? left : right;
        return rsl;
    }

    public static int max(int left, int right, int front) {
       int rsl = max(left, right) < front ? front : max(left, right);
       return rsl;
    }

    public static int max(int first, int second, int third, int forth) {
        int rsl = max(first, second, third) < forth ? forth : max(first, second, third);
        return rsl;
    }
}
