package com.codegym.task.task04.task0419;

/* 
Maximum of four numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String sNum1 = bufferedReader.readLine();
        String sNum2 = bufferedReader.readLine();
        String sNum3 = bufferedReader.readLine();
        String sNum4 = bufferedReader.readLine();

        int num1 = Integer.parseInt(sNum1);
        int num2 = Integer.parseInt(sNum2);
        int num3 = Integer.parseInt(sNum3);
        int num4 = Integer.parseInt(sNum4);

        System.out.println(max(max(num1, num2), max(num3, num4)));
    }
    public static int max(int a, int b){
        if (a > b)
            return a;
        else if (b > a)
            return b;
        else
            return a;
    }
}
