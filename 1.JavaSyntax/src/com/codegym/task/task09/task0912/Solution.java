package com.codegym.task.task09.task0912;

/* 
Exception when working with numbers

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        try{
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        }

        //write your code here
        catch (NumberFormatException numberFormatException){
            System.out.println(numberFormatException);
        }
    }
}
