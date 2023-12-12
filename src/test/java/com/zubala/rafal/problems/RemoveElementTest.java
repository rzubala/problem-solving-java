package com.zubala.rafal.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveElementTest {

    private final RemoveElement removeElement = new RemoveElement();

    @Test
    void removeElement() {
        int[] nums1 = { 3,2,2,3 };
        int val1 = 3;
        assertEquals(2, removeElement.removeElement(nums1, val1));

        int[] nums2 = { 0,1,2,2,3,0,4,2 };
        int val2 = 2;
        assertEquals(5, removeElement.removeElement(nums2, val2));
    }
}