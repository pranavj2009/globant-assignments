package com.programming;
/*
 * Find duplicate elements in a List
 * */

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question3 {
    public static void main(String[] args) {
        List<Character> inputList = Arrays.asList('G','O','O','G','L','E');
        printDuplicateElements(inputList);
    }

    private static void printDuplicateElements(List<Character> inputList) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char letter : inputList) {
            if (!charCountMap.containsKey(letter)) {
                charCountMap.put(letter, 1);
            } else {
                charCountMap.put(letter, charCountMap.get(letter) + 1);
            }
        }

        for (char letter : charCountMap.keySet()) {
            if(charCountMap.get(letter)>1){
                System.out.println(letter);
            }
        }
    }
}

