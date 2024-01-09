package com.zubala.rafal.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KTopFrequentElementsTest {

    private final KTopFrequentElements kTopFrequentElements = new KTopFrequentElements();

    @Test
    void topKFrequent() {

        int[] nums1 = {1,1,1,2,2,3};
        int[] result1 = kTopFrequentElements.topKFrequent(nums1, 2);
        int[] expected1 = {1,2};
        assertArrayEquals(expected1, result1);

        int[] nums2 = {1};
        int[] result2 = kTopFrequentElements.topKFrequent(nums2, 1);
        int[] expected2 = {1};
        assertArrayEquals(expected2, result2);
    }
}