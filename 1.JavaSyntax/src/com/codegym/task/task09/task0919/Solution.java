package com.codegym.task.task09.task0919;

/* 
Dividing by zero

*/

public class Solution {

    public static void main(String[] args) {
        try{
            divideByZero();
        }
        catch (ArithmeticException arithmeticException){
                arithmeticException.printStackTrace();
        }
    }

    public static void divideByZero() {
        int num = 36;
        System.out.println(num / 0);
    }
}
