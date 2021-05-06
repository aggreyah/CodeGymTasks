package com.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Longest sequence

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> ints = new ArrayList<>();
        for (int i = 0; i < 10; i++) ints.add(Integer.parseInt(reader.readLine()));
        int repeated = 1;
        for (int i = 0; i < ints.size() - 1; i++){

            if (ints.get(i) == ints.get(i + 1)){
                repeated ++;
            }
        }
    }
}
