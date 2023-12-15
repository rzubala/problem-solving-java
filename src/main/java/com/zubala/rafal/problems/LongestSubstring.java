package com.zubala.rafal.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * @see <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/description/">Problem description</a>
 */
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }
        Set<Character> set = new HashSet<>();
        int left=0, right=0;
        int max = 0;
        while (right < s.length()) {
            char current = s.charAt(right);
            while (set.contains(current)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(current);
            right++;
            max = Math.max(max, set.size());
        }
        return max;
    }
}