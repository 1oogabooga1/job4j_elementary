package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = {4, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = {2, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort10() {
        int[] data = {2, 4, 5, 6, 7, 8, 1, 3, 9, 10};
        int[] result = SortSelected.sort(data);
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertThat(result).containsExactly(expected);
    }
}