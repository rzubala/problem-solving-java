package com.zubala.rafal.problems;

import com.zubala.rafal.problems.model.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/path-sum/">Problem description</a>
 */
public class PathSum {
    public boolean hasPathSumBFS(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        TreeNode node;
        List<TreeNode> queue = new LinkedList<>();
        List<Integer> sums = new LinkedList<>();
        queue.add(root);
        sums.add(0);
        while (!queue.isEmpty()) {
            node = queue.remove(0);
            int nodeSum = sums.remove(0) + node.val;
            boolean last = true;
            if (node.left != null) {
                queue.add(node.left);
                sums.add(nodeSum);
                last = false;
            }
            if (node.right != null) {
                queue.add(node.right);
                sums.add(nodeSum);
                last = false;
            }
            if (last && nodeSum == targetSum) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPathSumDFS(TreeNode root, int targetSum) {
        return hasPathSum(root, 0, targetSum);
    }

    private boolean hasPathSum(TreeNode node, int acc, int target) {
        if (node == null) {
            return false;
        }
        int nodeSum = acc + node.val;
        if (node.left == null && node.right == null) {
            return nodeSum == target;
        }
        boolean hasLeft = false;
        if (node.left != null) {
            hasLeft = hasPathSum(node.left, nodeSum, target);
        }
        boolean hasRight = false;
        if (node.right != null) {
            hasRight = hasPathSum(node.right, nodeSum, target);
        }
        return hasLeft | hasRight;
    }
}
