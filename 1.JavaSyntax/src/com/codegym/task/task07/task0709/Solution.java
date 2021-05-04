package com.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Expressing ourselves more concisely

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++){
            strings.add(reader.readLine());
        }
        int shortestLength = Integer.MAX_VALUE;
        for (String item: strings)
            if(item.length() < shortestLength)
                shortestLength = item.length();

        for (String item:strings)
            if (item.length() == shortestLength)
                System.out.println(item);
    }
}
