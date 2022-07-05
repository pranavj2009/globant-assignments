package com.programming;

import java.util.HashMap;
import java.util.Map;

/*
* For any given String, return the occurrence of each character in the format - character followed by it’s occurrence
For example, for input string “google”, output should be “g2o2l1e1”
* */
public class Question1 {
    public static void main(String[] args) {
        String input = "google";
        printEachCharacterOccurance(input);
    }

    private static void printEachCharacterOccurance(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char letter : input.toCharArray()) {
            if (!charCountMap.containsKey(letter)) {
                charCountMap.put(letter, 1);
            } else {
                charCountMap.put(letter, charCountMap.get(letter) + 1);
            }
        }

        for (char letter : charCountMap.keySet()) {
            System.out.print(letter+""+charCountMap.get(letter));
        }
    }
}
