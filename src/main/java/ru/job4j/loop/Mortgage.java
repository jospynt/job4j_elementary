package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        amount = (1 + percent / 100) * amount - salary;
        while (amount > 0) {
            year++;
            amount = (1 + percent / 100) * amount - salary;
        }
        return year;
    }
}
