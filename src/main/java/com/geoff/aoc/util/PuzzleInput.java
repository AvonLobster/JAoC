package com.geoff.aoc.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class PuzzleInput {
    public static String readPuzzleInput(int year, int day) {
        Resource resource = new ClassPathResource(year + "\\" + day + ".txt");
        String input = "";
        
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(resource.getInputStream()));
            StringBuilder builder = new StringBuilder();
            String line = null;
            String eol = System.getProperty("line.separator");

            while ((line = reader.readLine()) != null) {
                builder.append(line);
                builder.append(eol);
            }

            builder.deleteCharAt(builder.length() - 1);
            reader.close();
            input = builder.toString();
        } catch (IOException e) {
            System.err.println("Error in PuzzleInput.readPuzzleInput");
            e.printStackTrace();
        }

        return input;
    }
}
