package com.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Shortest or longest

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++)
            strings.add(reader.readLine());

        int shortestLength = Integer.MAX_VALUE;
        int longestLength = 0;

        for (String item: strings){
            if (item.length() < shortestLength)
                shortestLength = item.length();
            if (item.length() > longestLength)
                longestLength = item.length();
        }

        for (String item: strings)
            if (item.length() == shortestLength || item.length() == longestLength){
                System.out.println(item);
                break;
            }
    }
}
