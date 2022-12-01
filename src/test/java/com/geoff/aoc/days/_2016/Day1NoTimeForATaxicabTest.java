package com.geoff.aoc.days._2016;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Day1NoTimeForATaxicabTest {
    Day1NoTimeForATaxicab day = new Day1NoTimeForATaxicab();

    @Test
    void testBlocksAway1() {
        String input = "R2, L3";

        assertEquals(5, day.blocksAway(input));
    }

    @Test
    void testBlocksAway2() {
        String input = "R2, R2, R2";

        assertEquals(2, day.blocksAway(input));
    }

    @Test
    void testBlocksAway3() {
        String input = "R5, L5, R5, R3";

        assertEquals(12, day.blocksAway(input));
    }

    @Test
    void testBlocksAway4() {
        String input = "R0, R1, R1";

        assertEquals(2, day.blocksAway(input));
    }
}
