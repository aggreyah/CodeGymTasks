package com.codegym.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Min and max in arrays

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        //write your code here
        int[] ints = new int[20];
        for (int i = 0; i < ints.length; i++) ints[i] = Integer.parseInt(reader.readLine());

        for (int j = 0; j < ints.length; j++){
            if (ints[j] > maximum) maximum = ints[j];
            if (ints[j] < minimum) minimum = ints[j];
        }

        System.out.print(maximum + " " + minimum);
    }
}
