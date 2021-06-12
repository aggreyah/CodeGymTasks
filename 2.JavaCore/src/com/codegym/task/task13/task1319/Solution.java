package com.codegym.task.task13.task1319;

import java.io.*;

/* 
Writing to a file from the console

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(bufferedReader.readLine()));

        while (true){
            String currentLine = bufferedReader.readLine();
            if (currentLine.equals("exit")){
                bufferedWriter.write(currentLine);
                bufferedWriter.newLine();
                break;
            }
            else{
                bufferedWriter.write(currentLine);
                bufferedWriter.newLine();
            }
        }
        bufferedWriter.close();
    }
}
