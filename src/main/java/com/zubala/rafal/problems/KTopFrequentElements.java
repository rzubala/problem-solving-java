package com.zubala.rafal.problems;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @see <a href="https://leetcode.com/problems/top-k-frequent-elements/description/">Problem description</a>
 */
public class KTopFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqs = new HashMap<>();
        IntStream.of(nums).forEach(num -> {
            freqs.put(num, freqs.getOrDefault(num, 0) + 1);
        });
        List<Integer>[] bucket = new List[nums.length + 1];
        freqs.keySet().forEach(num -> {
            int freq = freqs.get(num);
            List<Integer> numList = bucket[freq];
            if (numList == null) {
                numList = new ArrayList<>();
                bucket[freq] = numList;
            } else {
                numList = bucket[freq];
            }
            numList.add(num);
        });
        int[] res = new int[k];
        int kit = 0;
        int index = nums.length;
        while (kit < k && index >= 0) {
            List<Integer> topFrequentNums = bucket[index--];
            if (topFrequentNums == null) {
                continue;
            }
            for (Integer topFrequentNum : topFrequentNums) {
                res[kit++] = topFrequentNum;
                if (kit == k) {
                    break;
                }
            }
        }
        return res;
    }
}
