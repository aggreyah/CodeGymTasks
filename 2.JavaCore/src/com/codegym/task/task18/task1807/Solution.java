package com.codegym.task.task18.task1807;

/* 
Counting commas

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    final static int COMMAASCII = (int)',';
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName);
        int count = 0;
        while (inputStream.available() > 0){
            int currentByteValue = inputStream.read();
            if (currentByteValue == COMMAASCII)
                count++;
        }
        reader.close();
        inputStream.close();
        System.out.println(count);
    }
}