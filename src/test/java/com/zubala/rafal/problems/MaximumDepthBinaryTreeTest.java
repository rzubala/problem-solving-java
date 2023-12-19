package com.zubala.rafal.problems;

import com.zubala.rafal.problems.model.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class MaximumDepthBinaryTreeTest {

    MaximumDepthBinaryTree maximumDepthBinaryTree = new MaximumDepthBinaryTree();

    @Test
    void testMaxDepth() {
        Integer[] input1 = { 3,9,20,null,null,15,7 };
        TreeNode root1 = buildBinaryTree(input1);
        printBinaryTree(root1, new LinkedList<>());
        assertEquals(3, maximumDepthBinaryTree.maxDepth(root1));

        Integer[] input2 = { 1, null, 2 };
        TreeNode root2 = buildBinaryTree(input2);
        printBinaryTree(root2, new LinkedList<>());
        assertEquals(2, maximumDepthBinaryTree.maxDepth(root2));
    }

    private static void printBinaryTree(TreeNode node, List<Integer> stack) {
        if (node == null) {
            return;
        }
        stack.add(node.val);
        printBinaryTree(node.left, new LinkedList<Integer>(stack));
        printBinaryTree(node.right, new LinkedList<Integer>(stack));
        if (node.left == null && node.right == null) {
            System.out.println(stack.stream().map(String::valueOf).collect(Collectors.joining("->")));
        }
    }

    private static TreeNode buildBinaryTree(Integer[] input) {
        List<TreeNode> stack = new LinkedList<>();
        boolean left = true;
        TreeNode root = null;
        for (Integer i : input) {
            if (stack.isEmpty()) {
                TreeNode node = new TreeNode(i);
                stack.add(node);
                root = node;
                continue;
            }
            if (i != null) {
                TreeNode parent = stack.getFirst();
                TreeNode current = new TreeNode(i);
                stack.add(current);
                if (left) {
                    parent.left = current;
                } else {
                    parent.right = current;
                }
            }
            if (!left) {
                stack.removeFirst();
            }
            left = !left;
        }
        return root;
    }
}