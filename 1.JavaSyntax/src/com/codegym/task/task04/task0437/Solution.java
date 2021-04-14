package com.codegym.task.task04.task0437;


/* 
Triangle of eights

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        for (int i = 0; i <= 10; i++){
            for (int j = 1; j <= i ; j ++){
                if (j < i)
                    System.out.print("8");
                else
                    System.out.println("8");
            }
        }
    }
}
