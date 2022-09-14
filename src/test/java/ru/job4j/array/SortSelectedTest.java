package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class SortSelectedTest {
    @Test
    public void whenSort5() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {3, 4, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 3, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort4() {
        int[] data = new int[] {3, 0, 1, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 3, 3};
        assertThat(result).containsExactly(expected);
    }
}