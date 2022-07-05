package com.programming;
/*
 * Compare two Lists containing unordered integer elements
 * */

import java.util.Arrays;
import java.util.List;

public class Question2 {
    public static void main(String[] args) {
        List<Integer> inputList1 = Arrays.asList(5, 3, 4, 1, 2);
        List<Integer> inputList2 = Arrays.asList(1, 5, 4, 3, 2);

        if (inputList1.containsAll(inputList2) && inputList2.size() == inputList1.size()) {
            System.out.println("Lists are equal");
        } else {
            System.out.println("Lists are not equal");
        }
    }
}
