package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double diffAndDev(double first, double second) {
        return diff(first, second) + div(first, second);
    }

    public static double summ(double first, double second, double third, double fourth) {
        return sum(first, second) + multiply(first, second) + diff(first, second) + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат первого расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат второго расчета равен: " + diffAndDev(10, 20));
        System.out.println("Результат третьего расчета равен: " + summ(10, 20, 10, 20));
    }
}

