package com.codegym.task.task04.task0436;


/* 
Drawing a rectangle

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String sM = bufferedReader.readLine();
        String sN = bufferedReader.readLine();

        int m = Integer.parseInt(sM);
        int n = Integer.parseInt(sN);

        for (int i = 1; i <= m; i ++){
            for (int j = 1; j <= n; j++){
                if (j < n)
                    System.out.print("8");
                else
                    System.out.println("8");
            }
        }
    }
}
