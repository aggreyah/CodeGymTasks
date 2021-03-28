package com.codegym.task.task04.task0414;

/* 
Number of days in the year

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        final int LEAP_YEAR = 366;
        final int NOT_LEAP_YEAR = 365;
        BufferedReader bufferedReader = new
                BufferedReader(new InputStreamReader(System.in));
        String sYear = bufferedReader.readLine();
        int year = Integer.parseInt(sYear);
        int x = 0;

        if (((year / 400) > 0) && ((year % 400) == 0))
            x = LEAP_YEAR;
        else{
            if (((year / 100) > 0) && ((year % 100) == 0))
                x = NOT_LEAP_YEAR;
            else
                if (((year / 4) > 0) && ((year % 4) == 0))
                    x = LEAP_YEAR;
                else
                    x = NOT_LEAP_YEAR;
        }
        System.out.println("Number of days in the year: " + x);
    }
}