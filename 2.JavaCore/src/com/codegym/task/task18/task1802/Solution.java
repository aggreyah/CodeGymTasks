package com.codegym.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Minimum byte

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);

        byte min = (byte) inputStream.read();
        while (inputStream.available() > 0){
            int current = inputStream.read();
            if (min > current)
                min = (byte) current;
        }
        System.out.println(min);
        inputStream.close();
        reader.close();

    }
}
