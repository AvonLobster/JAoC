package com.geoff.aoc.days._2015;

import org.springframework.stereotype.Component;

import com.geoff.aoc.days.AoCDay;
import com.geoff.aoc.util.PuzzleInput;

@Component
public class Day1NotQuiteLisp implements AoCDay {

    @Override
    public String part1() {
        String input = PuzzleInput.readPuzzleInput(2015, 1);
        return Integer.toString(findFloor(input));
    }

    @Override
    public String part2() {
        return "not yet";
    }
    
    public int findFloor(String instructions) {
        int floor = 0;
        char[] ins = instructions.toCharArray();

        for (char i : ins) {
            switch(i) {
                case '(':
                    floor++;
                    break;
                case ')':
                    floor--;
                    break;
                default:
                    System.out.println("Error in Day1NotQuiteLisp.findFloor");
            }
        }

        System.out.println("Day1NotQuiteLisp.findFloor: " + floor);

        return floor;
    }
}
