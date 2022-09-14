package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        money -= price;
        while (money != 0) {
            for (int i = 0; i < 4; i++) {
                if (money >= coins[i]) {
                    money -= coins[i];
                    rsl[size] = coins[i];
                    break;
                }
            }
            size++;
        }
        return Arrays.copyOf(rsl, size);
    }
}
