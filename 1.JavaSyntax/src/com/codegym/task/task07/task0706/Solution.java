package com.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Streets and houses

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] myArray = new int[15];
        int oddNum = 0;
        int evenNum = 0;
        for(int i = 0; i < myArray.length; i ++){
            myArray[i] = Integer.parseInt(bufferedReader.readLine());
            if (myArray[i] % 2 == 0)
                evenNum += 1;
            else
                oddNum += 1;
        }
        if (oddNum > evenNum)
            System.out.println("Odd-numbered houses have more residents.");
        else
            System.out.println("Even-numbered houses have more residents.");
    }
}
