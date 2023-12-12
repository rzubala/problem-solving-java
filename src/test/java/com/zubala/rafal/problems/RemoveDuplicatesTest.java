package com.zubala.rafal.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesTest {

    private final RemoveDuplicates removeDuplicates = new RemoveDuplicates();

    @Test
    void removeDuplicates() {
        int[] nums1 = {1,1,2};
        assertEquals(2, removeDuplicates.removeDuplicates(nums1));

        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        assertEquals(5, removeDuplicates.removeDuplicates(nums2));
    }
}