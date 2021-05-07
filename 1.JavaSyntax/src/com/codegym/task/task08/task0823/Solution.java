package com.codegym.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Going national

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String result = "";

        //write your code here
        ArrayList<String> words = new ArrayList<>(Arrays.asList(s.trim().split("\\s+")));
        for (String item : words)
            result += item.substring(0, 1).toUpperCase() + item.substring(1) + " ";
        System.out.println(result);
    }
}
