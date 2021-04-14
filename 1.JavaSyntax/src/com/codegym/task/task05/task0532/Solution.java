package com.codegym.task.task05.task0532;

import java.io.*;
import java.math.BigInteger;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;

        //write your code here
        int n = Integer.parseInt(reader.readLine());
        if (n > 0){
            for (int i = 0; i < n; i++){
                int currentNum = Integer.parseInt(reader.readLine());
                if (maximum < currentNum)
                    maximum = currentNum;
            }
            System.out.println(maximum);
        }
    }
}
