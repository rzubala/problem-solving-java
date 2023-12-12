package com.zubala.rafal.problems;

/**
 * @see <a href="https://leetcode.com/problems/remove-element/description/">Problem description</a>
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        var length = nums.length;
        int left=0, right=0;
        while(right < length) {
            if (nums[right] != val) {
                if (left != right) {
                    int tmp = nums[right];
                    nums[right] = nums[left];
                    nums[left] = tmp;
                }
                left++;
            }
            right++;
        }
        return left;
    }
}
