package com.codegym.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Ascending numbers

*/

public class Solution {
    public static ArrayList<Integer> ints = new ArrayList<Integer>();
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
        for(int i = 0; i < 5; i++){
            ints.add(Integer.parseInt(reader.readLine()));
        }

        Collections.sort(ints);

        int i = 0;
        while (i < 5){
            if (i < 4)
                System.out.println(ints.get(i));
            else
                System.out.print(ints.get(i));
            i += 1;
        }
    }
}
