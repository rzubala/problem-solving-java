package com.zubala.rafal.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @see <a href="https://favtutor.com/blogs/combination-sum">Problem description</a>
 */
public class CombinationSumBacktracking {
    public int combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        backtrack(candidates, 0, target, new ArrayList<Integer>(), result);
        return result.size();
    }

    public void backtrack(int[] candidates, int start, int target, List<Integer> stack, List<List<Integer>> result) {
        if (target < 0) {
            return;
        } else if (target == 0) {
            result.add(new ArrayList<Integer>(stack));
        }
        for (int i = start; i < candidates.length; i++) {
            stack.add(candidates[i]);
            backtrack(candidates, i, target - candidates[i], stack, result);
            stack.remove(stack.size() - 1);
        }
    }
}
