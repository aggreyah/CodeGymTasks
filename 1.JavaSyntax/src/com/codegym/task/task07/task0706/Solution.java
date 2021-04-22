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
        int[] houses = new  int[15];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < houses.length; i++){
            houses[i] = Integer.parseInt(bufferedReader.readLine());
        }
        int numberInOddSide = 0, numberInEvenSide = 0;
        for(int j = 0; j < houses.length; j++){
            if (j % 2 == 0)
                numberInEvenSide += houses[j];
            else
                numberInOddSide += houses[j];
        }
        if (numberInEvenSide > numberInOddSide)
            System.out.println("Even-numbered houses have more residents.");
        else
            System.out.println("Odd-numbered houses have more residents.");
    }
}
