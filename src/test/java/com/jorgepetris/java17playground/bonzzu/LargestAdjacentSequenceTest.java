package com.jorgepetris.java17playground.bonzzu;

import static org.junit.jupiter.api.Assertions.*;

import com.jorgepetris.java17playground.interviewcodechallenge.bonzzu.LargestAdjacentSequence;
import org.junit.jupiter.api.Test;
import java.util.List;


class LargestAdjacentSequenceTest

{

    @Test
    void findLongestSequenceReturnsFourForFirstExample() {
        List<Integer> input = List.of(9, 10, 4, 2, 1, 5, 8, 7);
        int result = LargestAdjacentSequence.findLongestSequence(input);
        assertEquals(4, result);
    }

    @Test
    void findLongestSequenceReturnsFourForSecondExample() {
        List<Integer> input = List.of(100, 4, 200, 1, 3, 2);
        int result = LargestAdjacentSequence.findLongestSequence(input);
        assertEquals(4, result);
    }

}