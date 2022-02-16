package com.codegym.task.task19.task1910;

/* 
Punctuation

*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();
        bufferedReader.close();

        BufferedReader file1Reader = new BufferedReader(new FileReader(file1));
        List<String> file1Lines = new ArrayList<>();
        while (file1Reader.ready())
            file1Lines.add(file1Reader.readLine());
        file1Reader.close();

        BufferedWriter file2Writer = new BufferedWriter(new FileWriter(file2));
        for (String line : file1Lines) {
            line = line.replaceAll("\\p{P}", "");
            file2Writer.write(line);
        }
        file2Writer.close();
    }
}
