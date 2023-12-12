package com.zubala.rafal.problems;

/**
 * @see <a href="https://leetcode.com/problems/reverse-string/">Problem description</a>
 */
public class StringReverse {
    public char[] reverseString(char[] s) {
        var length = s.length;
        if (length <= 1) {
            return s;
        }
        int i =0 ;
        while (i < length/2) {
            var tmp = s[length - 1 - i];
            s[length - 1 - i] = s[i];
            s[i] = tmp;
            i++;
        }
        return s;
    }
}