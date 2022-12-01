package com.geoff.aoc.days;

import com.geoff.aoc.days._2015.Day1NotQuiteLisp;

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
            default:
                throw new IllegalArgumentException("Day not created yet: " + year + "-" + day);
        }
    }
}
