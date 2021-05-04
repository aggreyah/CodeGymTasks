package com.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Longest string

*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //write your code here
        strings = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++){
            strings.add(bufferedReader.readLine());
        }
        int lengthOfLongest = 0;
        for (int i = 0; i < strings.size(); i++){
            if (lengthOfLongest < strings.get(i).length())
                lengthOfLongest = strings.get(i).length();
        }
        for (String item: strings)
            if(item.length() == lengthOfLongest)
                System.out.println(item);
    }
}
