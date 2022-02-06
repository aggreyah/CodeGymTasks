package com.codegym.task.task18.task1819;

/* 
Combining files

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();

        FileInputStream fileInputStream1 = new FileInputStream(file1);
        FileInputStream fileInputStream2 = new FileInputStream(file2);
        FileOutputStream fileOutputStream1 = new FileOutputStream(file1);

        byte[] buffer1 = new byte[fileInputStream1.available()];
        fileInputStream1.read(buffer1);
        byte[] buffer2 = new byte[fileInputStream2.available()];
        fileInputStream2.read(buffer2);

        fileOutputStream1.write(buffer2);
        fileOutputStream1.close();
        FileOutputStream fileOutputStream1_2 = new FileOutputStream(file1, true);
        fileOutputStream1_2.write(buffer1);

        fileInputStream1.close();
        fileOutputStream1_2.close();
        fileInputStream2.close();
    }
}
