package com.codegym.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Remove and insert

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++){
            strings.add(reader.readLine());
        }
        int lastIndex = strings.size() - 1;
        for (int i = 0; i < 13; i++)
            strings.add(0, strings.remove(lastIndex));

        for (String item: strings)
            System.out.println(item);
    }
}
