package com.codegym.task.task18.task1816;

/* 
ABCs

*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        byte[] buffer = new byte[fileInputStream.available()];
        fileInputStream.read(buffer);
        fileInputStream.close();
        int count = 0;

        for (byte item: buffer)
            if ((item >= 65 && item <= 95) || (item >= 97 && item <= 122))
                count++;
        System.out.println(count);
    }
}
