package com.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
One large array and two small ones

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] largeArray = new int[20];
        int[] smallArrayOne = new int[10];
        int[] smallArrayTwo = new int[10];

        int outerI = 0;
        for (int i = 0; i < largeArray.length; i ++){
            largeArray[i] = Integer.parseInt(bufferedReader.readLine());
        }

        for (int j = 0; j < largeArray.length / 2 ; j ++){
            smallArrayOne[j] = largeArray[j];
            outerI += 1;
        }

        for (int j = 0; j < smallArrayTwo.length; j ++){
            smallArrayTwo[j] = largeArray[outerI];
            System.out.println(smallArrayTwo[j]);
            outerI += 1;
        }

    }
}
