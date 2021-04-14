package com.codegym.task.task04.task0420;

/* 
Sorting three numbers

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

        arrange(num1, num2, num3);
    }
    public static void arrange(int a, int b, int c){
        int max1 = max(a, max(b, c));
        int max2;
        int max3;
        if (max1 == a){
            max2 = max(b, c);
            if (max2 == b)
                max3 = c;
            else
                max3 = b;
        }
        else if (max1 == b){
            max2 = max(a, c);
            if (max2 == a)
                max3 = c;
            else
                max3 = a;
        }
        else{
            max2 = max(a, b);
            if (max2 == a)
                max3 = b;
            else
                max3 = a;
        }
        System.out.println(max1 + " " + max2 + " " + max3);
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
