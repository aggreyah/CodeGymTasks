package com.codegym.task.task04.task0429;

/* 
Positive and negative numbers

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
        int negativeNumCount = 0;

        if (num1 > 0)
            positiveNumCount += 1;
        else if (num1 < 0 && num1 != 0)
            negativeNumCount += 1;

        if (num2 > 0)
            positiveNumCount += 1;
        else if (num2 < 0 && num2 != 0)
            negativeNumCount += 1;

        if (num3 > 0)
            positiveNumCount += 1;
        else if (num3 < 0 && num3 != 0)
            negativeNumCount += 1;

        System.out.println("Number of negative numbers: " + negativeNumCount);
        System.out.println("Number of positive numbers: " + positiveNumCount);
    }
}
