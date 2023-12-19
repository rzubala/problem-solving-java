package com.zubala.rafal.problems;

import com.zubala.rafal.problems.model.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static com.zubala.rafal.problems.utils.TreeNodeUtils.buildBinaryTree;
import static com.zubala.rafal.problems.utils.TreeNodeUtils.printBinaryTree;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumDepthBinaryTreeTest {

    MaximumDepthBinaryTree maximumDepthBinaryTree = new MaximumDepthBinaryTree();

    @Test
    void testMaxDepth() {
        Integer[] input1 = { 3,9,20,null,null,15,7 };
        TreeNode root1 = buildBinaryTree(input1);
        assertEquals(3, maximumDepthBinaryTree.maxDepth(root1));

        Integer[] input2 = { 1, null, 2 };
        TreeNode root2 = buildBinaryTree(input2);
        assertEquals(2, maximumDepthBinaryTree.maxDepth(root2));
    }
}