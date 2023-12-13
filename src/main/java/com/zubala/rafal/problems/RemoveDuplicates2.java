package com.zubala.rafal.problems;

/**
 * @see <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/">Problem description</a>
 */
public class RemoveDuplicates2 {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length <= 2) {
            return length;
        }
        int left=2, right=2;
        while (right < length) {
            if (nums[right] != nums[left - 2]) {
                nums[left] = nums[right];
                left++;
            }
            right++;
        }
        return left;
    }
}
