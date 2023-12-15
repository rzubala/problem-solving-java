package com.zubala.rafal.problems;

import java.util.Arrays;
import java.util.Collections;

/**
 * @see <a href="https://www.geeksforgeeks.org/k-largestor-smallest-elements-in-an-array/">Problem description</a>
 */
public class KLargestElements {
    public Integer[] kLargest(Integer[] arr, int k) {
        Arrays.sort(arr, Collections.reverseOrder());
        return Arrays.stream(arr).limit(k).toList().toArray(new Integer[0]);
    }
}
