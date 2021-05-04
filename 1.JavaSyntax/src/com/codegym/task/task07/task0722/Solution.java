package com.codegym.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
The end

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
        ArrayList<String> strings = new ArrayList<>();
        for (String currentString = reader.readLine(); !currentString.equals("end"); currentString = reader.readLine()){
            strings.add(currentString);
        }
        for (String item: strings) System.out.println(item);
    }
}