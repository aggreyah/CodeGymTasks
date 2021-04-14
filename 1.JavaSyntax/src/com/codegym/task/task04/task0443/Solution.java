package com.codegym.task.task04.task0443;


/* 
A name is a name

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        String year = bufferedReader.readLine();
        String month = bufferedReader.readLine();
        String day = bufferedReader.readLine();

        System.out.println("My name is " + name + ".");
        System.out.println("I was born on " + month + "/" + day + "/" + year);
    }
}
