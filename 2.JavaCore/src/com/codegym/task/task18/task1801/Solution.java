package com.codegym.task.task18.task1801;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Maximum byte

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);

        int max = fileInputStream.read();
        while (fileInputStream.available() > 0){
            int current = fileInputStream.read();
            if (max < current)
                max = current;
        }
//        bufferedReader.close();
        fileInputStream.close();
        System.out.println(max);
    }
}
