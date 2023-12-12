package com.zubala.rafal.problems;

import java.util.stream.IntStream;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        char[] nums = String.valueOf(x).toCharArray();
        int left=0, right= nums.length - 1;
        while(left < right) {
            if (nums[left] != nums[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
