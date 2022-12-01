package com.geoff.aoc._2015;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.geoff.aoc.days._2015.Day1NotQuiteLisp;

@SpringBootTest
public class Day1NotQuiteLispTest {
    Day1NotQuiteLisp day1 = new Day1NotQuiteLisp();

    @Test
    void testFindFloor1() {
        String input = "(())";
        int result = day1.findFloor(input);

        assertEquals(0, result);
    }
}
