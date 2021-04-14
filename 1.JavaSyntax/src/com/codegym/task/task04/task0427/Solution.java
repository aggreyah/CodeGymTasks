package com.codegym.task.task04.task0427;

/* 
Describing numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String sNum = bufferedReader.readLine();
        int numOfDigits = sNum.length();
        int num = Integer.parseInt(sNum);

        if (numOfDigits == 1 && num % 2 == 0 && num > 0)
            System.out.println("even single-digit number");
        else if (numOfDigits == 1 && num % 2 != 0 && num > 0)
            System.out.println("odd single-digit number");
        else if (numOfDigits == 2 && num % 2 == 0)
            System.out.println("even two-digit number");
        else if (numOfDigits == 2 && num % 2 != 0)
            System.out.println("odd two-digit number");
        else if (numOfDigits == 3 && num % 2 == 0)
            System.out.println("even three-digit number");
        else if (numOfDigits == 3 && num % 2 != 0)
            System.out.println("odd three-digit number");
    }
}
