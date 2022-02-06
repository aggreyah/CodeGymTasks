package com.codegym.task.task18.task1820;

/* 
Rounding numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();

        FileInputStream fileInputStream1 = new FileInputStream(file1);
        FileOutputStream fileOutputStream2 = new FileOutputStream(file2);

        byte[] buffer1 = new byte[fileInputStream1.available()];
        fileInputStream1.read(buffer1);
        fileInputStream1.close();

        String buffer1String = new String(buffer1);
        String[] buffer1StringArray = buffer1String.split(" ");
        for (int i = 0; i < buffer1StringArray.length; i++) {
            double realNum = Double.parseDouble(buffer1StringArray[i]);
            int realNumInt = (int) Math.round(realNum);
            String realNumIntString = String.valueOf(realNumInt);
            fileOutputStream2.write(realNumIntString.getBytes());
            if (i != buffer1StringArray.length - 1)
                fileOutputStream2.write(32);
        }
        fileOutputStream2.close();
    }
}