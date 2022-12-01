package com.geoff.aoc.days._2016;

import com.geoff.aoc.days.AoCDay;
import com.geoff.aoc.util.PuzzleInput;
import com.geoff.aoc.util.Manhatten.ManhattanDistance;

public class Day1NoTimeForATaxicab implements AoCDay {
    String input;

    public Day1NoTimeForATaxicab() {
        input = PuzzleInput.readPuzzleInput(2016, 1);
    }

    @Override
    public String part1() {
        return Integer.toString(blocksAway(input));
    }

    @Override
    public String part2() {
        // TODO Auto-generated method stub
        return null;
    }

    public int blocksAway(String instructions) {
        ManhattanDistance md = new ManhattanDistance();
        String[] ins = instructions.split(", ");

        for (int i = 0; i < ins.length; i++) {
            char turn = ins[i].charAt(0);
            int move = Integer.parseInt(ins[i].substring(1, ins[i].length()));

            switch (turn) {
                case 'R':
                    md.turnRight();
                    break;
                case 'L':
                    md.turnLeft();
                    break;
            }

            md.moveForward(move);
        }

        int ans = md.manhattanDistance(0, 0);
        System.out.println("Day1NoTimeFOrATaxiCab.blocksAway: " + ans);

        return ans;
    }
    
}
