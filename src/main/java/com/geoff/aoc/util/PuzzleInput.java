package com.geoff.aoc.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PuzzleInput {
    public static String readPuzzleInput(int year, int day) {
        String input = "";
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\carls\\source\\JAoC\\src\\main\\resources\\" + year + "\\" + day + ".txt"));
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
