package com.zubala.rafal.problems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.zubala.rafal.problems.utils.TreeNodeUtils.buildBinaryTree;
import static org.junit.jupiter.api.Assertions.*;

class PathSum2Test {
    private final PathSum2 pathSum2 = new PathSum2();
    @Test
    public void testPathSum2() {
        Integer[] input1 = { 5,4,8,11,null,13,4,7,2,null,null,5,1 };
        List<List<Integer>> result1 = pathSum2.pathSum(buildBinaryTree(input1), 22);
        assertNotNull(result1);
        assertEquals(result1.size(), 2);
        Integer[] expected1_1 = {5,4,11,2};
        Integer[] expected1_2 = {5,8,4,5};
        assertArrayEquals(expected1_1, result1.get(0).toArray());
        assertArrayEquals(expected1_2, result1.get(1).toArray());


        Integer[] input2 = { 1,2,3 };
        List<List<Integer>> result2 = pathSum2.pathSum(buildBinaryTree(input2), 5);
        assertNotNull(result2);
        assertTrue(result2.isEmpty());
    }

}