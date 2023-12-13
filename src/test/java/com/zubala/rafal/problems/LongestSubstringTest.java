package com.zubala.rafal.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringTest {

    private final LongestSubstring longestSubstring = new LongestSubstring();

    @Test
    void lengthOfLongestSubstring() {
        String input = "abcabcbb";
        assertEquals(3, longestSubstring.lengthOfLongestSubstring(input));

        input = "bbbbb";
        assertEquals(1, longestSubstring.lengthOfLongestSubstring(input));

        input = "pwwkew";
        assertEquals(3, longestSubstring.lengthOfLongestSubstring(input));
    }
}