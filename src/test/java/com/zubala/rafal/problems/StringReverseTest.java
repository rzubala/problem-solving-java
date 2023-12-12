package com.zubala.rafal.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringReverseTest {

    private final StringReverse stringReverse = new StringReverse();

    @Test
    void reverseString() {
        char[] input1 = {'h', 'e', 'l', 'l', 'o'};
        char[] expected1 = {'o', 'l', 'l', 'e', 'h'};
        assertEquals(String.valueOf(expected1), String.valueOf(stringReverse.reverseString(input1)));

        char[] input2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        char[] expected2 = {'h', 'a', 'n', 'n', 'a', 'H'};
        assertEquals(String.valueOf(expected2), String.valueOf(stringReverse.reverseString(input2)));
    }
}