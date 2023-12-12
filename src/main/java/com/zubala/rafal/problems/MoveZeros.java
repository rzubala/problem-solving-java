package com.zubala.rafal.problems;

/**
 * @see <a href="https://leetcode.com/problems/move-zeroes/description/">Problem description</a>
 */
public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int left=0, right=0;

        while(right < nums.length) {
            if (nums[right] != 0) {
                int tmp = nums[right];
                nums[right] = nums[left];
                nums[left] = tmp;
                left++;
            }
            right++;
        }
    }
}
