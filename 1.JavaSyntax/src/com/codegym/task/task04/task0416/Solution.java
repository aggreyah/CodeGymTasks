package com.codegym.task.task04.task0416;

/* 
Crossing the road blindly

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new
                BufferedReader(new InputStreamReader(System.in));
        String sMinutes = bufferedReader.readLine();
        double minutes = Double.parseDouble(sMinutes);

        double minutesWithinFive = minutes % 5;
        if (minutesWithinFive < 3)
            System.out.println("green");
        else
            if (minutesWithinFive < 4)
                System.out.println("yellow");
            else
                System.out.println("red");
    }
}