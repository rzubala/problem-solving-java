package com.zubala.rafal.problems;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @see <a href="https://leetcode.com/problems/combination-sum-ii/description/">Problem description</a>
 */
public class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new LinkedList<>();
        if (candidates.length == 0) {
            return result;
        }
        List<Integer> list = Arrays.stream(candidates)
                .boxed()
                .sorted()
                .collect(Collectors.toCollection(LinkedList::new));

        backtrack(list, target, 0, new LinkedList<Integer>(), result);

        return result;
    }

    private void backtrack(List<Integer> candidates, int target, int start, List<Integer> tmpList, List<List<Integer>> result) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            result.add(new LinkedList<>(tmpList));
            return;
        }
        for (int i = start; i < candidates.size(); i++) {
            Integer val = candidates.get(i);
            if (i > start && val.equals(candidates.get(i - 1))) {
                continue;
            }
            tmpList.add(val);
            backtrack(candidates, target - val, i + 1, tmpList, result);
            tmpList.removeLast();
        }
    }
}