package com.codegym.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Console-based piggy bank

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true){
            String sInput = bufferedReader.readLine();
            if (sInput.equals("sum"))
                break;
            else{
                int num = Integer.parseInt(sInput);
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
