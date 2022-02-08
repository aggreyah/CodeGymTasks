package com.codegym.task.task18.task1824;

/* 
Files and exceptions

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String currentFile = reader.readLine();
            FileInputStream fileInputStream;
            try {
                 fileInputStream = new FileInputStream(currentFile);
            }catch (FileNotFoundException e){
                System.out.println(currentFile);
                break;
            }
            fileInputStream.close();
        }
    }
}
