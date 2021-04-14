package com.codegym.task.task04.task0432;



/* 
You can't have too much of a good thing

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String sMyString = bufferedReader.readLine();
        String sNumOfTimes = bufferedReader.readLine();

        int numOfTimes = Integer.parseInt(sNumOfTimes);

        while (numOfTimes > 0)
        {
            System.out.println(sMyString);
            numOfTimes -= 1;
        }
    }
}
