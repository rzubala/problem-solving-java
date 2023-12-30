package com.zubala.rafal.problems;

import com.zubala.rafal.problems.model.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/path-sum/">Problem description</a>
 */
public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
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
}
