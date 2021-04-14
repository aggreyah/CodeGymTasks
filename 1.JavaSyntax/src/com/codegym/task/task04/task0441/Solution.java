package com.codegym.task.task04.task0441;


/* 
Somehow average

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

        findMedian(num1, num2, num3);
    }

    private static void findMedian(int num1, int num2, int num3) {
        if ((num1 == num2) && (num1 == num3)){
            System.out.println(num1);
        }
        else{
            int maxNum = max(num1, max(num2, num3));
            int minNum = min(num1, min(num2, num3));
            if ((num1 != num2) && (num1 != num3)){
                if (num1 != minNum && num1 != maxNum)
                    System.out.println(num1);
                else if (num2 != minNum && num2 != maxNum)
                    System.out.println(num2);
                else
                    System.out.println(num3);
            }
            else if ((num1 == num2) && (num1 != num3)){
                System.out.println(num1);
            }
            else if ((num1 != num2) && (num2 == num3)){
                System.out.println(num2);
            }
            else if ((num1 == num3) && (num1 != num2)){
                System.out.println(num1);
            }
        }
    }

    private static int min(int a, int b){
        if (a <= b)
            return a;
        else
            return b;
    }

    private static int max(int a, int b){
        if (a >= b)
            return a;
        else
            return b;
    }
}
