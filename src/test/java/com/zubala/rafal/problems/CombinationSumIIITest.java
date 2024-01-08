package com.zubala.rafal.problems;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumIIITest {

    private final CombinationSumIII combinationSumIII = new CombinationSumIII();

    @Test
    void combinationSum3() {
        List<List<Integer>> result1 = combinationSumIII.combinationSum3(3, 7);
        assertEquals(1, result1.size());
        Integer[] result1_1 = {1,2,4};
        assertArrayEquals(result1_1, result1.get(0).toArray());

        List<List<Integer>> result2 = combinationSumIII.combinationSum3(3, 9);
        assertEquals(3, result2.size());

        Integer[] result2_1 = {1,2,6};
        assertArrayEquals(result2_1, result2.get(0).toArray());

        Integer[] result2_2 = {1,3,5};
        assertArrayEquals(result2_2, result2.get(1).toArray());

        Integer[] result2_3 = {2,3,4};
        assertArrayEquals(result2_3, result2.get(2).toArray());

        List<List<Integer>> result3 = combinationSumIII.combinationSum3(4, 1);
        assertEquals(0, result3.size());

        List<List<Integer>> result4 = combinationSumIII.combinationSum3(9, 45);
        assertEquals(1, result4.size());
        Integer[] result4_1 = {1,2,3,4,5,6,7,8,9};
        assertArrayEquals(result4_1, result4.get(0).toArray());
    }
}