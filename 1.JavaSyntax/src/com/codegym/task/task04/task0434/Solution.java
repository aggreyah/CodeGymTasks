package com.codegym.task.task04.task0434;


/* 
Multiplication table

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int i = 1;
        while ( i <= 10){
            int j = 1;
            while (j <= 10){
                if (j < 10)
                    System.out.print(j * i + " ");
                else
                    System.out.println(j * i);
                j += 1;
            }
            i += 1;
        }
    }
}
