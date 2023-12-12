package com.zubala.rafal.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicates2Test {

    private final RemoveDuplicates2 removeDuplicates = new RemoveDuplicates2();

    @Test
    void removeDuplicates() {
        int[] nums1 = {1,1,1,2,2,3};
        assertEquals(5, removeDuplicates.removeDuplicates(nums1));

        int[] nums2 = {0,0,1,1,1,1,2,3,3};
        assertEquals(7, removeDuplicates.removeDuplicates(nums2));
    }
}