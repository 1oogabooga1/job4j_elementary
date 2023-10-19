package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To2Then3() {
        int left = 3;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To3Then3() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax4To2and3Then4() {
        int left = 2;
        int right = 3;
        int front = 4;
        int result = Max.max(left, right, front);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To6and7and2Then7() {
        int left = 5;
        int right = 6;
        int forth = 2;
        int third = 7;
        int result = Max.max(left, right, forth, third);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

}
