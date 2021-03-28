package com.codegym.task.task04.task0415;

/* 
Rule of the triangle

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new
                BufferedReader(new InputStreamReader(System.in));
        String sSide1 = bufferedReader.readLine();
        String sSide2 = bufferedReader.readLine();
        String sSide3 = bufferedReader.readLine();

        int side1 = Integer.parseInt(sSide1);
        int side2 = Integer.parseInt(sSide2);
        int side3 = Integer.parseInt(sSide3);

        if ((side1 >= (side2 + side3)) || (side2 >= (side1 + side3)) || (side3 >= (side1 + side2)))
            System.out.println("The triangle is not possible.");
        else
            System.out.println("The triangle is possible.");

    }
}