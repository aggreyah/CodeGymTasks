package com.codegym.task.task01.task0132;

/* 
Sum of the digits of a three-digit number

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //write your code here
        String intString = "" + number;
        String [] stringArray = intString.split("");
        int sum = 0;
        for (String i : stringArray) sum += Integer.parseInt(i);
        return sum;
    }
}