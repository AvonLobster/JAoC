package com.geoff.aoc.days._2022;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Day1CalorieCountingTest {
    Day1CalorieCounting day = new Day1CalorieCounting();

    @Test
    void testMostCaloricElf() {
        String input =  """
                        1000
                        2000
                        3000
                        
                        4000
                        
                        5000
                        6000
                        
                        7000
                        8000
                        9000
                        
                        10000
                        """;
                
        assertEquals(24000, day.mostCaloricElf(input));
    }

    @Test
    void testTop3Elves() {
        String input =  """
                        1000
                        2000
                        3000
                        
                        4000
                        
                        5000
                        6000
                        
                        7000
                        8000
                        9000
                        
                        10000
                        """;
                
        assertEquals(45000, day.top3MostCaloricElves(input));
    }
}
