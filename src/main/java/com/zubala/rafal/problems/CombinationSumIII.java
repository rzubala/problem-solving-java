package com.zubala.rafal.problems;

import java.util.LinkedList;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/combination-sum-iii/description/">Problem description</a>
 */
public class CombinationSumIII {

    private final static int FROM = 1;

    private final static int TO = 9;

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new LinkedList<>();
        backtrack(k, n, FROM, new LinkedList<Integer>(), result);
        return result;
    }

    private void backtrack(int k, int target, int start, LinkedList<Integer> tmpList, List<List<Integer>> result) {
        if (tmpList.size() == k && target == 0) {
            result.add(new LinkedList<>(tmpList));
            return;
        }
        if (target <= 0) {
            return;
        }
        for (int i=start;i<=TO;i++) {
            tmpList.add(i);
            backtrack(k, target - i, i + 1, tmpList, result);
            tmpList.removeLast();
        }
    }
}
