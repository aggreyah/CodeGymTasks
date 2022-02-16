package com.codegym.task.task19.task1908;

/* 
Picking out numbers

*/

import java.io.*;
import java.nio.CharBuffer;
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
        while (file1Reader.ready()){
            lines.add(file1Reader.readLine());
        }
        file1Reader.close();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));
        for (String line : lines) {
            String[] lineStringsSpaceRemoved = line.split(" ");
            for (int i = 0; i < lineStringsSpaceRemoved.length; i++){
                try {
                    Integer.parseInt(lineStringsSpaceRemoved[i]);
                    bufferedWriter.write(lineStringsSpaceRemoved[i] + " ");
                } catch (NumberFormatException e) {
                    continue;
                }
            }
        }
        bufferedWriter.close();
    }
}