package com.codegym.task.task04.task0428;

/* 
Positive number

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String sNum1 = bufferedReader.readLine();
        String sNum2 = bufferedReader.readLine();
        String sNum3 = bufferedReader.readLine();

        int num1 = Integer.parseInt(sNum1);
        int num2 = Integer.parseInt(sNum2);
        int num3 = Integer.parseInt(sNum3);

        int positiveNumCount = 0;

        if (num1 > 0)
            positiveNumCount += 1;
        if (num2 > 0)
            positiveNumCount += 1;
        if (num3 > 1)
            positiveNumCount += 1;

        System.out.println(positiveNumCount);
    }
}
