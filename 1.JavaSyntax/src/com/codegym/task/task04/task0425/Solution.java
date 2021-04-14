package com.codegym.task.task04.task0425;

/* 
Target locked!

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String sInt1 = bufferedReader.readLine();
        String sInt2 = bufferedReader.readLine();

        int int1 = Integer.parseInt(sInt1);
        int int2 = Integer.parseInt(sInt2);

        if (int1 > 0 && int2 > 0)
            System.out.println(1);
        else if (int1 < 0 && int2 > 0)
            System.out.println(2);
        else if (int1 < 0 && int2 < 0)
            System.out.println(3);
        else if (int1 > 0 && int2 < 0)
            System.out.println(4);
    }
}
