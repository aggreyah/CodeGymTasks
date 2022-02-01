package com.codegym.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Transactionality

*/

public class Solution {
    public static List<String> allLines = new ArrayList<>();
    public static List<String> linesForRemoval = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        BufferedReader readerForConsole = new BufferedReader(new InputStreamReader(System.in));
        String file1 = readerForConsole.readLine();
        String file2 = readerForConsole.readLine();
        readerForConsole.close();

        BufferedReader readerFile1 = new BufferedReader(new FileReader(file1));
        BufferedReader readerFile2 = new BufferedReader(new FileReader(file2));
        String currentLine = readerFile1.readLine();

        while (currentLine != null){
            solution.allLines.add(currentLine);
            currentLine = readerFile1.readLine();
        }
        currentLine = readerFile2.readLine();
        while (currentLine != null){
            solution.linesForRemoval.add(currentLine);
            currentLine = readerFile2.readLine();
        }
        readerFile1.close();
        readerFile2.close();
        solution.joinData();
    }

    public void joinData() throws CorruptedDataException {
        if (this.allLines.containsAll(this.linesForRemoval))
            for (String line: this.linesForRemoval)
                this.allLines.remove(line);
        else{
            this.allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
