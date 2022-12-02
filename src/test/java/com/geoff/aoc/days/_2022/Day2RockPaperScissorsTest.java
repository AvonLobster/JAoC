package com.geoff.aoc.days._2022;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Day2RockPaperScissorsTest {
    Day2RockPaperScissors day = new Day2RockPaperScissors();

    @Test
    void testStrategyGuide() {
        String input =  """
                        A Y
                        B X
                        C Z
                        """;
        
        assertEquals(15, day.strategyGuide(input));
    }

    @Test
    void testRevisedStrategy() {
        String input =  """
                        A Y
                        B X
                        C Z
                        """;
        
        assertEquals(12, day.revisedStrategy(input));
    }
}
