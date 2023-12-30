package com.zubala.rafal.problems;

import org.junit.jupiter.api.Test;

import static com.zubala.rafal.problems.utils.TreeNodeUtils.buildBinaryTree;
import static org.junit.jupiter.api.Assertions.*;

class PathSumTest {

    private final PathSum pathSum = new PathSum();
    @Test
    void hasPathSumBFS() {
        Integer[] input1 = { 5,4,8,11,null,13,4,7,2,null,null,null,1 };
        assertTrue(pathSum.hasPathSumBFS(buildBinaryTree(input1), 22));

        Integer[] input2 = { 1,2,3 };
        assertFalse(pathSum.hasPathSumBFS(buildBinaryTree(input2), 5));
    }

    @Test
    void hasPathSumDFS() {
        Integer[] input1 = { 5,4,8,11,null,13,4,7,2,null,null,null,1 };
        assertTrue(pathSum.hasPathSumDFS(buildBinaryTree(input1), 22));

        Integer[] input2 = { 1,2,3 };
        assertFalse(pathSum.hasPathSumDFS(buildBinaryTree(input2), 5));

        Integer[] input3 = { 1,2 };
        assertFalse(pathSum.hasPathSumDFS(buildBinaryTree(input3), 1));

        Integer[] input4 = { };
        assertFalse(pathSum.hasPathSumDFS(buildBinaryTree(input4), 0));
    }
}