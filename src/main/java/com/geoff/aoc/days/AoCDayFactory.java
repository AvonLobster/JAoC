package com.geoff.aoc.days;

import com.geoff.aoc.days._2015.Day1NotQuiteLisp;
import com.geoff.aoc.days._2016.Day1NoTimeForATaxicab;
import com.geoff.aoc.days._2022.Day1CalorieCounting;
import com.geoff.aoc.days._2022.Day2RockPaperScissors;

public class AoCDayFactory {

    public AoCDay createDay(String year, String day) throws IllegalArgumentException {
        switch (year) {
            case "2015":
                switch (day) {
                    case "1":
                        return new Day1NotQuiteLisp();
                    default:
                        throw new IllegalArgumentException("Day not created yet: " + year + "-" + day);
                }
            case "2016":
                switch (day) {
                    case "1":
                        return new Day1NoTimeForATaxicab();
                    default:
                        throw new IllegalArgumentException("Day not created yet: " + year + "-" + day);
                }
            case "2022":
                switch (day) {
                    case "1":
                        return new Day1CalorieCounting();
                    case "2":
                        return new Day2RockPaperScissors();
                    default:
                        throw new IllegalArgumentException("Day not created yet: " + year + "-" + day);
                }
            default:
                throw new IllegalArgumentException("Day not created yet: " + year + "-" + day);
        }
    }
}
