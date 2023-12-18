package com.zubala.rafal.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class KLargestElementsTest {

    private final KLargestElements kLargestElements = new KLargestElements();

    @Test
    void kLargest() {
        Integer[] input1 = {1, 23, 12, 9, 30, 2, 50};
        Integer[] expected1 = {50, 30, 23};
        int k = 3;
        assertArrayEquals(expected1, kLargestElements.kLargestSort(input1, k));

        Integer[] input2 = {11, 5, 12, 9, 44, 17, 2};
        Integer[] expected2 = {44, 17};
        k = 2;
        assertArrayEquals(expected2, kLargestElements.kLargestSort(input2, k));
    }

    @Test
    void kLargestBinarySearch() {
        Integer[] input1 = {1, 23, 12, 9, 30, 2, 50};
        Integer[] expected1 = {50, 30, 23};
        int k = 3;
        assertArrayEquals(expected1, kLargestElements.kLargestBinarySearch(input1, k));

        Integer[] input2 = {11, 5, 12, 9, 44, 17, 2};
        Integer[] expected2 = {44, 17};
        k = 2;
        assertArrayEquals(expected2, kLargestElements.kLargestBinarySearch(input2, k));
    }
}