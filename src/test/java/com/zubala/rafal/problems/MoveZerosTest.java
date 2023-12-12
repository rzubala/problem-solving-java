package com.zubala.rafal.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MoveZerosTest {
    private final MoveZeros moveZeros = new MoveZeros();

    @Test
    void moveZeroes() {
        int[] input1 = { 0, 1, 0, 3, 12 };
        int[] expected1 = { 1, 3, 12, 0, 0 };
        moveZeros.moveZeroes(input1);
        assertArrayEquals(expected1, input1);

        int[] input2 = { 0 };
        int[] expected2 = { 0 };
        moveZeros.moveZeroes(input2);
        assertArrayEquals(expected2, input2);
    }
}