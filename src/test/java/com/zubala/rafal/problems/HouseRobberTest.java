package com.zubala.rafal.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobberTest {

    private final HouseRobber houseRobber = new HouseRobber();
    @Test
    void rob() {
        int[] nums1 = {1,2,3,1};
        int result1 = houseRobber.rob(nums1);
        assertEquals(4, result1);

        int[] nums2 = {2,7,9,3,1};
        int result2 = houseRobber.rob(nums2);
        assertEquals(12, result2);
    }
}