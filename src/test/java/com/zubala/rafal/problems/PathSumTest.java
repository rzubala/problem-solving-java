package com.zubala.rafal.problems;

import org.junit.jupiter.api.Test;

import static com.zubala.rafal.problems.utils.TreeNodeUtils.buildBinaryTree;
import static org.junit.jupiter.api.Assertions.*;

class PathSumTest {

    private final PathSum pathSum = new PathSum();
    @Test
    void hasPathSum() {
        Integer[] input1 = { 5,4,8,11,null,13,4,7,2,null,null,null,1 };
        assertTrue(pathSum.hasPathSum(buildBinaryTree(input1), 22));

        Integer[] input2 = { 1,2,3 };
        assertFalse(pathSum.hasPathSum(buildBinaryTree(input2), 5));
    }
}