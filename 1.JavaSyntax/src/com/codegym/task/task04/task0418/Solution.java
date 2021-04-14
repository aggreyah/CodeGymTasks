package com.codegym.task.task04.task0418;

/* 
Minimum of two numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String sInt1 = bufferedReader.readLine();
        String sInt2 = bufferedReader.readLine();

        int int1 = Integer.parseInt(sInt1);
        int int2 = Integer.parseInt(sInt2);

        if (int1 < int2)
            System.out.println(int1);
        else{
            if (int2 < int1)
                System.out.println(int2);
            else
                System.out.println(int1);
        }
    }
}