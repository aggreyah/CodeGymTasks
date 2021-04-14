package com.codegym.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Lonely arrays interact

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] myStringArray = new String[10];
        int[] myIntArray = new int[10];

        for(int i = 0; i < myStringArray.length; i++){
            myStringArray[i] = bufferedReader.readLine();
        }

        for (int j = 0; j < myIntArray.length; j++){
            myIntArray[j] = myStringArray[j].length();
        }

        for (int k = 0; k < myIntArray.length; k++){
            System.out.println(myIntArray[k]);
        }
    }
}
