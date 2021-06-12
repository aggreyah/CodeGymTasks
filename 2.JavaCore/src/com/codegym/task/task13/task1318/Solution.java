package com.codegym.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Reading a file

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
        while (fileInputStream.available() > 0){
            System.out.print((char)fileInputStream.read());
        }
        bufferedReader.close();
        fileInputStream.close();
    }
}