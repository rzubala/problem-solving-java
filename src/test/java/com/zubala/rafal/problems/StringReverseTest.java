package com.zubala.rafal.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class StringReverseTest {

    private final StringReverse stringReverse = new StringReverse();

    @Test
    void reverseString() {
        char[] input1 = {'h', 'e', 'l', 'l', 'o'};
        char[] expected1 = {'o', 'l', 'l', 'e', 'h'};
        stringReverse.reverseString(input1);
        assertArrayEquals(expected1, input1);

        char[] input2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        char[] expected2 = {'h', 'a', 'n', 'n', 'a', 'H'};
        stringReverse.reverseString(input2);
        assertArrayEquals(expected2, input2);
    }
}