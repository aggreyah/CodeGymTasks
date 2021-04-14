package com.codegym.task.task05.task0507;

/* 
Arithmetic mean

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        double sum = 0;
        int count = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String sNum = bufferedReader.readLine();
            int num = Integer.parseInt(sNum);
            if (num != -1){
                sum += num;
                count += 1;
            }
            else
                break;
        }
        System.out.println(sum / count);
    }
}

