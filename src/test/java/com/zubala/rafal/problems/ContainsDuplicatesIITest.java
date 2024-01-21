package com.zubala.rafal.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicatesIITest {

    private final ContainsDuplicatesII containsDuplicatesII = new ContainsDuplicatesII();

    @Test
    void containsNearbyDuplicate() {
        int[] nums1 = {1,2,3,1};
        boolean res1 = containsDuplicatesII.containsNearbyDuplicate(nums1, 3);
        assertTrue(res1);

        int[] nums2 = {1,0,1,1};
        boolean res2 = containsDuplicatesII.containsNearbyDuplicate(nums2, 1);
        assertTrue(res2);

        int[] nums3 = {1,2,3,1,2,3};
        boolean res3 = containsDuplicatesII.containsNearbyDuplicate(nums3, 2);
        assertFalse(res3);
    }
}