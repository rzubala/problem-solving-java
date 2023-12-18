package com.zubala.rafal.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumBacktrackingTest {

    private final CombinationSumBacktracking combinationSumBacktracking = new CombinationSumBacktracking();
    @Test
    void combinationSum() {
        int[] nums = {2, 3, 5};
        int target = 8;
        // output [[2,2,2,2], [2,3,3], [3,5]]
        assertEquals(3, combinationSumBacktracking.combinationSum(nums, target));
    }
}