package com.codegym.task.task18.task1817;

/* 
Spaces

*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        byte[] buffer = new byte[fileInputStream.available()];
        fileInputStream.read(buffer);
        fileInputStream.close();

        int countAllChars = 0;
        int countSpaces = 0;
        for (byte item:buffer) {
            countAllChars++;
            if (item == 32)
                countSpaces++;
        }
        double ratio = (double) countSpaces  / countAllChars * 100;
        System.out.printf("%.2f", ratio);
    }
}
