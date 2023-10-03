package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {

    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot10ThenMinus1() {
       int[] data = new int[] {3, 4, 5, 6};
       int el = 10;
       int result = FindLoop.indexOf(data, el);
       int expected = -1;
       assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHas23Then5() {
        int[] data = new int[] {19, 18, 22, 23};
        int el = 23;
        int result = FindLoop.indexOf(data, el);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }
}