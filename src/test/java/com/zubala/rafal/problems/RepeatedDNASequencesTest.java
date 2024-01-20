package com.zubala.rafal.problems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RepeatedDNASequencesTest {

    private final RepeatedDNASequences repeatedDNASequences = new RepeatedDNASequences();
    @Test
    void findRepeatedDnaSequences() {
        String input1 ="AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> result1 = repeatedDNASequences.findRepeatedDnaSequences(input1);
        assertEquals(2, result1.size());
        assertEquals("AAAAACCCCC", result1.get(0));
        assertEquals("CCCCCAAAAA", result1.get(1));

        String input2 = "AAAAAAAAAAAAA";
        List<String> result2 = repeatedDNASequences.findRepeatedDnaSequences(input2);
        assertEquals(1, result2.size());
        assertEquals("AAAAAAAAAA", result2.get(0));
    }
}