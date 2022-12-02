package com.geoff.aoc.days._2022;

import com.geoff.aoc.days.AoCDay;
import com.geoff.aoc.util.PuzzleInput;

public class Day2RockPaperScissors implements AoCDay {
    String input;

    public Day2RockPaperScissors() {
        input = PuzzleInput.readPuzzleInput(2022, 2);
    }

    @Override
    public String part1() {
        return Integer.toString(strategyGuide(input));
    }

    @Override
    public String part2() {
        return Integer.toString(revisedStrategy(input));
    }
    
    public int strategyGuide(String input) {
        String[] ins = PuzzleInput.splitInputByNewLine(input);
        int score = 0;

        for (String i : ins) {
            String[] hands = i.split(" ");

            switch (hands[1]) {
                case "X":
                    score++;
                    
                    switch (hands[0]) {
                        case "A":
                            score += 3;
                            break;
                        case "C":
                            score += 6;
                            break;
                    }
                    break;
                case "Y":
                    score += 2;
                    
                    switch (hands[0]) {
                        case "A":
                            score += 6;
                            break;
                        case "B":
                            score += 3;
                            break;
                    }
                    break;
                case "Z":
                    score += 3;
                    
                    switch (hands[0]) {
                        case "B":
                            score += 6;
                            break;
                        case "C":
                            score += 3;
                            break;
                    }
                    break;
            }
        }

        System.out.println("Day2RockPaperScissors.strategyGuide: " + score);
        return score;
    }

    public int revisedStrategy(String input) {
        String[] ins = PuzzleInput.splitInputByNewLine(input);
        int score = 0;

        for (String i : ins) {
            String[] hands = i.split(" ");

            switch (hands[0]) {
                case "A":
                    switch (hands[1]) {
                        case "X":
                            score += 3;
                            break;
                        case "Y":
                            score += 4;
                            break;
                        case "Z":
                            score += 8;
                            break;
                    }
                    break;
                case "B":
                    switch (hands[1]) {
                        case "X":
                            score++;
                            break;
                        case "Y":
                            score += 5;
                            break;
                        case "Z":
                            score += 9;
                            break;
                    }

                    break;
                case "C":
                    switch (hands[1]) {
                        case "X":
                            score += 2;
                            break;
                        case "Y":
                            score += 6;
                            break;
                        case "Z":
                            score += 7;
                            break;
                    }

                    break;
            }
        }

        System.out.println("Day2RockPaperSciossors.revisedStrategy: " + score);
        return score;
    }
}
