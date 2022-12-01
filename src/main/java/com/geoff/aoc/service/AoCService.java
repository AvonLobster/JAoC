package com.geoff.aoc.service;

import org.springframework.stereotype.Service;

import com.geoff.aoc.days.AoCDay;
import com.geoff.aoc.days.AoCDayFactory;
import com.geoff.aoc.model.AoCResponse;

@Service
public class AoCService {
    private AoCDayFactory factory;

    public AoCService() {
        factory = new AoCDayFactory();
    }

    public AoCResponse adventOfCode(String _year, String _day) {
        AoCResponse response = new AoCResponse();

        try {
            AoCDay day = factory.createDay(_year, _day);
            response.setPart1(day.part1());
            response.setPart2(day.part2());
        } catch (IllegalArgumentException e) {
            System.out.println(_year + ", " + _day + " not implemented.");
            response.setPart1("Not implemented.");
        }
        
        return response;
    }
}
