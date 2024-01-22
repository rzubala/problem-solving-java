package com.zubala.rafal.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * @see <a href="https://leetcode.com/problems/contains-duplicate-ii/">Problem description</a>
 */
public class ContainsDuplicatesII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k == 0) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<nums.length;i++) {
            int current = nums[i];
            if (set.contains(current)) {
                return true;
            }
            if (set.size() == k) {
                set.remove(nums[i - k]);
            }
            set.add(current);
        }
        return false;
    }

    public boolean containsNearbyDuplicate1(int[] nums, int k) {
        int len = nums.length;
        int left = 0;
        while (left < len - 1) {
            for (int right=left+1;right<=left+k;right++) {
                if (right >= len) {
                    break;
                }
                if (nums[left] == nums[right]) {
                    return true;
                }
            }
            left++;
        }
        return false;
    }
}
