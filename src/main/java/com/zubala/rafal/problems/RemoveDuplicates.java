package com.zubala.rafal.problems;

/**
 * @see <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/">Problem description</a>
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        var length = nums.length;
        if (length == 0) {
            return 0;
        } else if (length == 1) {
            return 1;
        }
        int left=1,right=1;
        while (right < length) {
            if (nums[right] != nums[right - 1]) {
                nums[left] = nums[right];
                left++;
            }
            right++;
        }
        return left;
    }
}
