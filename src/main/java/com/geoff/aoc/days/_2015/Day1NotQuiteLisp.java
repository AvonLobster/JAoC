package com.geoff.aoc.days._2015;

import org.springframework.stereotype.Component;

import com.geoff.aoc.days.AoCDay;
import com.geoff.aoc.util.PuzzleInput;

@Component
public class Day1NotQuiteLisp implements AoCDay {
    String input;

    public Day1NotQuiteLisp() {
        input = PuzzleInput.readPuzzleInput(2015, 1);
    }

    @Override
    public String part1() {
        return Integer.toString(findFloor(input));
    }

    @Override
    public String part2() {
        return Integer.toString(findBasement(input));
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
            }
        }

        System.out.println("Day1NotQuiteLisp.findFloor: " + floor);

        return floor;
    }

    public int findBasement(String instructions) {
        int position = 0;
        int floor = 0;
        char[] ins = instructions.toCharArray();

        for (char i : ins) {
            position++;

            switch(i) {
                case '(':
                    floor++;
                    break;
                case ')':
                    floor--;
                    break;
            }

            if (floor == -1) {
                break;
            }
        }

        System.out.println("Day1NotQuiteList.findBasement: " + position);

        return position;
    }
}
