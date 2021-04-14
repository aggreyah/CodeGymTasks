package com.codegym.task.task04.task0426;

/* 
Labels and numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String sMyInt = bufferedReader.readLine();
        int myInt = Integer.parseInt(sMyInt);

        if (myInt < 0 && absolute(myInt) % 2 == 0)
            System.out.println("Negative even number");
        else if (myInt > 0 && absolute(myInt) % 2 != 0)
            System.out.println("Positive odd number");
        else if (myInt == 0)
            System.out.println("Zero");
        else if (myInt > 0 && absolute(myInt) % 2 == 0)
            System.out.println("Positive even number");
        else if (myInt < 0 && absolute(myInt) % 2 != 0)
            System.out.println("Negative odd number");
    }
    public static int absolute(int a){
        if (a < 0)
            return -a;
        else
            return a;
    }
}
