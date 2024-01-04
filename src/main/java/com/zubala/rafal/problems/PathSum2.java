package com.zubala.rafal.problems;

import com.zubala.rafal.problems.model.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @see <a href="https://leetcode.com/problems/path-sum-ii/description/">Problem description</a>
 */
public class PathSum2 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> results = new LinkedList<>();
        if (root == null) {
            return results;
        }
        List<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> paths = new LinkedList<>();
        queue.add(root);
        paths.add(new LinkedList<>());

        while (!queue.isEmpty()) {
            TreeNode parent = queue.getFirst();
            List<Integer> path = paths.getFirst();
            path.add(parent.val);
            boolean last = true;
            if (parent.left != null) {
                queue.add(parent.left);
                paths.add(new LinkedList<>(path));
                last = false;
            }
            if (parent.right != null) {
                queue.add(parent.right);
                paths.add(new LinkedList<>(path));
                last = false;
            }
            if (last && path.stream().mapToInt(Integer::intValue).sum() == targetSum) {
                results.add(path);
            }
            queue.removeFirst();
            paths.removeFirst();
        }
        return results;
    }
}
