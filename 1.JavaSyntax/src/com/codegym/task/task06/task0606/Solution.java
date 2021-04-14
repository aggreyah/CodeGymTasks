package com.codegym.task.task06.task0606;

import java.io.*;

/* 
Even and odd digits

*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String sNum = bufferedReader.readLine();
        String [] numArray = sNum.split("");

        for (String num : numArray){
            if (Integer.parseInt(num) % 2 == 0)
                even += 1;
            else
                odd += 1;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
