package com.zubala.rafal.problems;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * @see <a href="https://leetcode.com/problems/house-robber/description">Problem description</a>
 */
public class HouseRobber {
    public int rob(int[] nums) {
        AtomicInteger sumRobbed = new AtomicInteger();
        AtomicInteger sumPreviousRobbed = new AtomicInteger();
        IntStream.of(nums).forEach(money -> {
            int currentRob = money + sumPreviousRobbed.get();
            int currentPreviousRobbed = Math.max(sumRobbed.get(), sumPreviousRobbed.get());
            sumRobbed.set(currentRob);
            sumPreviousRobbed.set(currentPreviousRobbed);
        });
        return Math.max(sumRobbed.get(), sumPreviousRobbed.get());
    }
}
