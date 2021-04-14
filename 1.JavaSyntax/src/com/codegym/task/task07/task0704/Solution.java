package com.codegym.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Flip the array

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] myIntArray = new int[10];

        for (int i = 0; i < myIntArray.length; i++){
            myIntArray[i] = Integer.parseInt(bufferedReader.readLine());
        }

        for (int j = myIntArray.length - 1; j >= 0; j--){
            System.out.println(myIntArray[j]);
        }
    }
}

