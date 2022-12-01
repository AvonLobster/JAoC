package com.geoff.aoc.days._2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.geoff.aoc.days.AoCDay;
import com.geoff.aoc.util.PuzzleInput;

public class Day1CalorieCounting implements AoCDay {
    String input;

    public Day1CalorieCounting() {
        input = PuzzleInput.readPuzzleInput(2022, 1);
    }

    @Override
    public String part1() {
        return Integer.toString(mostCaloricElf(input));
    }

    @Override
    public String part2() {
        return Integer.toString(top3MostCaloricElves(input));
    }

    public int mostCaloricElf(String input) {
        List<Integer> calorieTotals = getSortedListOfElfCalories(input);
        int ans = calorieTotals.get(calorieTotals.size() - 1);

        System.out.println("Day1CalorieCounting.mostCaloricElf: " + ans);

        return ans;
    }

    public int top3MostCaloricElves(String input) {
        List<Integer> calorieTotals = getSortedListOfElfCalories(input);
        int ans = calorieTotals.get(calorieTotals.size() - 1);
        ans += calorieTotals.get(calorieTotals.size() - 2);
        ans += calorieTotals.get(calorieTotals.size() - 3);

        System.out.println("Day1CalorieCounting.top3MostCaloricElves: " + ans);

        return ans;
    }

    private List<Integer> getSortedListOfElfCalories(String input) {
        String[] lines = PuzzleInput.splitInputByNewLine(input);
        ArrayList<Integer> calTots = new ArrayList<>();
        int calTot = 0;

        for (int i = 0; i < lines.length; i++) {
            if (lines[i].isEmpty()) {
                calTots.add(calTot);
                calTot = 0;
            } else {
                calTot += Integer.parseInt(lines[i].replaceAll("[^0-9]+", ""));
            }
        }

        calTots.add(calTot);
        Collections.sort(calTots);

        return calTots;
    }
    
}
