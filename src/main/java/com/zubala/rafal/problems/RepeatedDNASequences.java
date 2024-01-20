package com.zubala.rafal.problems;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * @see <a href="https://leetcode.com/problems/repeated-dna-sequences/description/">Problem description</a>
 */
public class RepeatedDNASequences {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> sequences = new HashSet<>();
        Set<String> repeated = new LinkedHashSet<>();
        for (int i=0;i<s.length() + 1 - 10;i++) {
            String sequence = s.substring(i, i + 10);
            if (!sequences.add(sequence)) {
                repeated.add(sequence);
            }
        }
        return repeated.stream().toList();
    }
}
