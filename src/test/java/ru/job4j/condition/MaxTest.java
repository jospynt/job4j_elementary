package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax4To2Then4() {
        int left = 4;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To3To1Then3() {
        int result = Max.max(2, 3, 1);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax4To0ToMinus1Then4() {
        int result = Max.max(4, 0, -1);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To2To2Then2() {
        int result = Max.max(2, 2, 2);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMaxMinus2To1To0ToMinus5Then1() {
        int result = Max.max(-2, 1, 0, -5);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMaxMinus5toMinus7ToMinus2ToMinus8ThenMinus2() {
        int result = Max.max(-5, -7, -2, -8);
        int expected = -2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To0To1To2Then2() {
        int result = Max.max(2, 0, 1, 2);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }
}