package com.zubala.rafal.problems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumIITest {

    private final CombinationSumII combinationSumII = new CombinationSumII();

    @Test
    void combinationSum2() {
        int[] candidates1 = {10,1,2,7,6,1,5};
        List<List<Integer>> result1 = combinationSumII.combinationSum2(candidates1, 8);
        assertEquals(4, result1.size());
        /*
        Integer[] result1_1 = {1,1,6};
        assertArrayEquals(result1_1, result1.get(0).toArray());
        Integer[] result1_2 = {1,2,5};
        assertArrayEquals(result1_2, result1.get(1).toArray());
        Integer[] result1_3 = {1,7};
        assertArrayEquals(result1_3, result1.get(2).toArray());
        Integer[] result1_4 = {2,6};
        assertArrayEquals(result1_4, result1.get(3).toArray());
         */

        int[] candidates2 = {2,5,2,1,2};
        List<List<Integer>> result2 = combinationSumII.combinationSum2(candidates2, 5);
        assertEquals(2, result2.size());
        /*
        Integer[] result2_1 = {1,2,2};
        assertArrayEquals(result2_1, result2.get(0).toArray());
        Integer[] result2_2 = {5};
        assertArrayEquals(result2_2, result2.get(1).toArray());
        */
    }
}