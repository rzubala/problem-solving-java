package com.zubala.rafal.problems;

import com.zubala.rafal.problems.model.TreeNode;

/**
 * @see <a href="https://leetcode.com/problems/balanced-binary-tree/">Problem description</a>
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return getSubTreeDepth(root, 0) != -1;
    }

    private int getSubTreeDepth(TreeNode node, int level) {
        if (node == null) {
            return level;
        }
        int leftDepth = getSubTreeDepth(node.left, level + 1);
        int rightDepth = getSubTreeDepth(node.right, level + 1);
        if (leftDepth < 0 || rightDepth < 0) {
            return -1;
        }
        if (Math.abs(leftDepth - rightDepth) > 1) {
            return -1;
        }
        return Math.max(leftDepth, rightDepth);
    }
}
