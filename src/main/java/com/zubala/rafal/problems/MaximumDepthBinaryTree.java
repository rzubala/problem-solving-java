package com.zubala.rafal.problems;

import com.zubala.rafal.problems.model.TreeNode;

/**
 * @see <a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/">Problem description</a>
 */
public class MaximumDepthBinaryTree {
    public int maxDepth(TreeNode root) {
        return getTreeDepth(root, 0);
    }

    private int getTreeDepth(TreeNode node, int level) {
        if (node == null) {
            return level;
        }
        return Math.max(
            getTreeDepth(node.left, level + 1),
            getTreeDepth(node.right, level + 1));
    }
}
