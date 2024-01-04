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
        List<TreeNode> queue = new LinkedList<>();
        boolean left = true;
        TreeNode root = null;
        for (Integer i : input) {
            if (queue.isEmpty()) {
                TreeNode node = new TreeNode(i);
                queue.add(node);
                root = node;
                continue;
            }
            if (i != null) {
                TreeNode parent = queue.getFirst();
                TreeNode current = new TreeNode(i);
                queue.add(current);
                if (left) {
                    parent.left = current;
                } else {
                    parent.right = current;
                }
            }
            if (!left) {
                queue.removeFirst();
            }
            left = !left;
        }
        return root;
    }
}
