package com.codegym.task.task09.task0909;

/* 
Exception when working with arrays

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        try {
            int[] m = new int[2];
            m[8] = 5;
        }
        //write your code here
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println(arrayIndexOutOfBoundsException);
        }
    }
}
