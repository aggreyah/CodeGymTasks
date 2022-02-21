package com.codegym.task.task19.task1926;

/* 
Mirror image

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();

        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedFileReader = new BufferedReader(fileReader);

        while (bufferedFileReader.ready()){
            String line = bufferedFileReader.readLine();
            StringBuilder builder = new StringBuilder(line);
            String reversed = builder.reverse().toString();
            System.out.println(reversed);
        }
        fileReader.close();
        bufferedFileReader.close();
    }
}
