package com.codegym.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
More Sam-I-Am

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> list = new ArrayList<>();
        list.add("Sam");
        list.add("I");
        list.add("Am");

        int finalLength = list.size() + 3;
        int i = 0;

        while (i < finalLength){
            list.add(i + 1, "Ham");
            i += 2;
        }

        for (String item : list) System.out.println(item);
    }
}
