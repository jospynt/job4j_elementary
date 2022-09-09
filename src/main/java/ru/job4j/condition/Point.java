package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(4, 1, 2, 0);
        System.out.println("result (4, 1) to (2, 0) " + result);
        result = Point.distance(6, 3, 7, 5);
        System.out.println("result (6, 3) to (7, 5) " + result);
        result = Point.distance(1, 1, 9, 3);
        System.out.println("result (1, 1) to (9, 3) " + result);
    }
}
