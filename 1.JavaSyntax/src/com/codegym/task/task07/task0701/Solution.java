package com.codegym.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Maximum in an array

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // Create and populate the array
        int [] intArray = new int[20];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < intArray.length; i++){
            intArray[i] = Integer.parseInt(bufferedReader.readLine());
        }
        return intArray;
    }

    public static int max(int[] array) {
        // Find the maximum
        int max = Integer.MIN_VALUE;
        for (int item : array){
            if (item > max)
                max = item;
        }
        return max;
    }
}
