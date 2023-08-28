package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = x2 - x1;

        double scnd = y2 - y1;

        double third = Math.pow(first, 2);

        double forth = Math.pow(scnd, 2);

        double fifth = third + forth;

        double sixth = Math.sqrt(fifth);
        return sixth;
    }

    public static void main(String[] args) {
        double result = Point.distance(300, 3240, 2, 1230);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}

