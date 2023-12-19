package com.zubala.rafal.problems.utils;

import com.zubala.rafal.problems.model.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TreeNodeUtils {

    public static void printBinaryTree(TreeNode node, List<Integer> stack) {
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

    public static TreeNode buildBinaryTree(Integer[] input) {
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
