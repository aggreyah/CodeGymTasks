package com.codegym.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
String array in reverse order

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] myArray = new String[10];

        for (int i = 0; i < myArray.length - 2; i ++)
            myArray[i] = bufferedReader.readLine();

        for (int i = myArray.length - 1; i >= 0;  i --)
        {
            System.out.println(myArray[i]);
        }
    }
}