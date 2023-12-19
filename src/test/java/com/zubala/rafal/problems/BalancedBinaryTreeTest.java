package com.zubala.rafal.problems;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;
import static com.zubala.rafal.problems.utils.TreeNodeUtils.buildBinaryTree;
import static com.zubala.rafal.problems.utils.TreeNodeUtils.printBinaryTree;

class BalancedBinaryTreeTest {

    private final BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();

    @Test
    void isBalanced() {
        Integer[] input1 = { 3,9,20,null,null,15,7 };
        assertTrue(balancedBinaryTree.isBalanced(buildBinaryTree(input1)));

        Integer[] input2 = { 1,2,2,3,3,null,null,4,4 };
        assertFalse(balancedBinaryTree.isBalanced(buildBinaryTree(input2)));

        Integer[] input3 = {  };
        assertTrue(balancedBinaryTree.isBalanced(buildBinaryTree(input3)));
    }
}