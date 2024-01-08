package com.zubala.rafal.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Test
    void findKLargestIntArray() {
        int[] input1 = {3,2,1,5,6,4};
        assertEquals(5, kLargestElements.findKLargestIntArray(input1, 2));

        int[] input2 = {3,2,3,1,2,4,5,5,6};
        assertEquals(4, kLargestElements.findKLargestIntArray(input2, 4));
    }
}