package com.codegym.task.task09.task0907;

/* 
Exception when working with numbers

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        try {
            int a = 42 / 0;
        }
        catch (ArithmeticException arithmeticException){
            System.out.println(arithmeticException.toString());
        }


        //write your code here
    }
}
