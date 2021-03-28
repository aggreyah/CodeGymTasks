package com.codegym.task.task04.task0412;

/* 
Positive and negative numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));
        String sNum = bufferedReader.readLine();
        int num = Integer.parseInt(sNum);

        if (num > 0)
            System.out.println(2 * num);
        else
            if (num < 0){
                num += 1;
                System.out.println(num);
            }
            else
                System.out.println(num);
    }
}