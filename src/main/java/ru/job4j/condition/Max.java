package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int front) {
        return max(left, right) < front ? front : max(left, right);
    }

    public static int max(int first, int second, int third, int forth) {
        return max(first, second, third) < forth ? forth : max(first, second, third);
    }
}
