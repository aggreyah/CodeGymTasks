package com.codegym.task.task18.task1818;

/* 
Two in one

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();
        String file3 = bufferedReader.readLine();

        FileOutputStream fileOutputStream1 = new FileOutputStream(file1, true);
        FileInputStream fileInputStream2 = new FileInputStream(file2);
        FileInputStream fileInputStream3 = new FileInputStream(file3);

        byte[] buffer2 = new byte[fileInputStream2.available()];
        fileInputStream2.read(buffer2);
        fileOutputStream1.write(buffer2);
        byte[] buffer3 = new byte[fileInputStream3.available()];
        fileInputStream3.read(buffer3);
        fileOutputStream1.write(buffer3);

        fileOutputStream1.close();
        fileInputStream2.close();
        fileInputStream3.close();
    }
}
