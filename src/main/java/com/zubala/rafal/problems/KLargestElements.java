package com.zubala.rafal.problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/**
 * @see <a href="https://www.geeksforgeeks.org/k-largestor-smallest-elements-in-an-array/">Problem description</a>
 * @see <a href="https://leetcode.com/problems/kth-largest-element-in-an-array/">Problem description</a>
 */
public class KLargestElements {
    public Integer[] kLargestSort(Integer[] arr, int k) {
        Arrays.sort(arr, Collections.reverseOrder());
        return Arrays.stream(arr).limit(k).toList().toArray(new Integer[0]);
    }

    public int findKLargestIntArray(int[] nums, int k) {
        int low = IntStream.of(nums).min().getAsInt();
        int high = IntStream.of(nums).max().getAsInt();

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long count = IntStream.of(nums).filter(i -> i > mid).count();
            if (count >= k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }

    private int findKLargest(Integer[] arr, int k) {
        int low = Arrays.stream(arr).mapToInt(Integer::intValue).min().getAsInt();
        int high = Arrays.stream(arr).mapToInt(Integer::intValue).max().getAsInt();

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long count = Arrays.stream(arr).filter(i -> i > mid).count();
            if (count >= k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }

    public Integer[] kLargestBinarySearch(Integer[] arr, int k) {
        int kthLargest = findKLargest(arr, k);
        Arrays.sort(arr, Collections.reverseOrder());
        return Arrays.stream(arr).filter(i -> i >= kthLargest).toList().toArray(new Integer[0]);
    }
}
