package com.codegym.task.task19.task1909;

/* 
Changing punctuation marks

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
        List<String> lines = new ArrayList<>();
        while (file1Reader.ready())
            lines.add(file1Reader.readLine());
        file1Reader.close();

        BufferedWriter file2Writer = new BufferedWriter(new FileWriter(file2));
        for (int i = 0; i < lines.size(); i++) {
            String currentLine = lines.get(i);
            currentLine = currentLine.replaceAll("\\.", "!");
            if (i < lines.size() - 1)
                file2Writer.write(currentLine + "\r\n");
            else
                file2Writer.write(currentLine);
        }
        file2Writer.close();
    }
}