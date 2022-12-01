package com.geoff.aoc.days._2015;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.geoff.aoc.days._2015.Day1NotQuiteLisp;

@SpringBootTest
public class Day1NotQuiteLispTest {
    Day1NotQuiteLisp day1 = new Day1NotQuiteLisp();

    @Test
    void testFindFloor1() {
        String input = "(())";

        assertEquals(0, day1.findFloor(input));
    }

    @Test
    void testFindFloor2() {
        String input = "()()";
        
        assertEquals(0, day1.findFloor(input));
    }

    @Test
    void testFindFloor3() {
        String input = "(((";
        
        assertEquals(3, day1.findFloor(input));
    }

    @Test
    void testFindFloor4() {
        String input = "(()(()(";
        
        assertEquals(3, day1.findFloor(input));
    }

    @Test
    void testFindFloor5() {
        String input = "))(((((";
        
        assertEquals(3, day1.findFloor(input));
    }

    @Test
    void testFindFloor6() {
        String input = "())";
        
        assertEquals(-1, day1.findFloor(input));
    }

    @Test
    void testFindFloor7() {
        String input = "))(";
        
        assertEquals(-1, day1.findFloor(input));
    }

    @Test
    void testFindFloor8() {
        String input = ")))";
        
        assertEquals(-3, day1.findFloor(input));
    }

    @Test
    void testFindFloor9() {
        String input = ")())())";
        
        assertEquals(-3, day1.findFloor(input));
    }

    @Test
    void testFindBasement1() {
        String input = ")";

        assertEquals(1, day1.findBasement(input));
    }

    @Test
    void testFindBasement2() {
        String input = "()())";

        assertEquals(5, day1.findBasement(input));
    }
}
