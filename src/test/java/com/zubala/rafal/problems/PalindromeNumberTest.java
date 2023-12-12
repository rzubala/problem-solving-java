package com.zubala.rafal.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    private PalindromeNumber palindromeNumber;
    @BeforeEach
    void setUp() {
        palindromeNumber = new PalindromeNumber();
    }

    @Test
    void isPalindrome() {
        assertTrue(palindromeNumber.isPalindrome(121));

        assertFalse(palindromeNumber.isPalindrome(-121));

        assertFalse(palindromeNumber.isPalindrome(123456));

        assertTrue(palindromeNumber.isPalindrome(12344321));
    }
}