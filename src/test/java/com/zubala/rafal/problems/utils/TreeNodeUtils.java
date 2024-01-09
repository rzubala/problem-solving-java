package com.zubala.rafal.problems.utils;

import com.zubala.rafal.problems.model.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
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
        int length = Optional.ofNullable(input).map(a -> a.length).filter(l -> l >= 1).orElse(1);
        ArrayBlockingQueue<TreeNode> queue = new ArrayBlockingQueue<>(length);
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
                TreeNode parent = queue.peek();
                TreeNode current = new TreeNode(i);
                queue.add(current);
                if (left) {
                    parent.left = current;
                } else {
                    parent.right = current;
                }
            }
            if (!left) {
                queue.poll();
            }
            left = !left;
        }
        return root;
    }
}
