package com.codegym.task.task04.task0442;


/* 
Adding

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        while (true){
            String sNum = bufferedReader.readLine();
            int num = Integer.parseInt(sNum);
            if (num != -1)
                sum += num;
            else {
                sum += num;
                break;
            }
        }
        System.out.println(sum);
    }
}
