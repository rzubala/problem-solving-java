package com.zubala.rafal.problems;

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
