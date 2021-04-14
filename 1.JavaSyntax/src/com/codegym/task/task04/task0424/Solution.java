package com.codegym.task.task04.task0424;

/* 
Three numbers

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
        int ord1 = 1;
        int num2 = Integer.parseInt(sNum2);
        int ord2 = 2;
        int num3 = Integer.parseInt(sNum3);
        int ord3 = 3;

        if (num1 != num2 && num1 == num3)
            System.out.println(ord2);
        else if ((num2 != num3) && (num1 == num2))
            System.out.println(ord3);
        else if (num1 != num2 && num2 == num3)
            System.out.println(ord1);
    }
}
