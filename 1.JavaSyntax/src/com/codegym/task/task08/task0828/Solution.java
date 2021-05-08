package com.codegym.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Month number

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();

        Map<String, Integer> months = new HashMap<>(createMonthsCollection());
        System.out.println(month.substring(0, 1).toUpperCase() + month.substring(1) + " is month " + months.get(month.toUpperCase()));
    }

    private static HashMap<String, Integer> createMonthsCollection() {
        HashMap<String, Integer> months = new HashMap<>();
        months.put("JANUARY", 1);
        months.put("FEBRUARY", 2);
        months.put("MARCH", 3);
        months.put("APRIL", 4);
        months.put("MAY", 5);
        months.put("JUNE", 6);
        months.put("JULY", 7);
        months.put("AUGUST", 8);
        months.put("SEPTEMBER", 9);
        months.put("OCTOBER", 10);
        months.put("NOVEMBER", 11);
        months.put("DECEMBER", 12);

        return  months;
    }
}
