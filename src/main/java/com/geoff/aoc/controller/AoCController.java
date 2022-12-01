package com.geoff.aoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.geoff.aoc.model.AoCResponse;
import com.geoff.aoc.service.AoCService;

@Controller
@RequestMapping(value = "/aoc")
public class AoCController {
    @Autowired
    private AoCService service;
    
    @GetMapping("/{year}/{day}")
    public ResponseEntity<AoCResponse> adventOfCode(@PathVariable String year, @PathVariable String day) {
        AoCResponse response = service.adventOfCode(year, day);

        return new ResponseEntity<AoCResponse>(response, HttpStatus.OK);
    }
}
