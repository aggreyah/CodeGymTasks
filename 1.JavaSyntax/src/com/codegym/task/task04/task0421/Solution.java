package com.codegym.task.task04.task0421;

/* 
Jen or Jen?

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String nameOne = bufferedReader.readLine();
        String nameTwo = bufferedReader.readLine();
        if (nameOne.equals(nameTwo))
            System.out.println("The names are identical");
        else
            if (nameOne.length() == nameTwo.length())
                System.out.println("The names are the same length");
    }
}
