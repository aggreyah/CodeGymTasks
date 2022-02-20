package com.codegym.task.task19.task1923;

/* 
Words with numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file1 = args[0];
        String file2 = args[1];

        FileReader fileReader =  new FileReader(file1);
        BufferedReader file1Reader = new BufferedReader(fileReader);

        FileWriter file2Writer = new FileWriter(file2);

        while (file1Reader.ready()){
            String line = file1Reader.readLine();
            String[] words = line.split(" ");
            for (String word: words) {
                if (wordContainsNum(word))
                    file2Writer.write(word + " ");
            }
        }
        file1Reader.close();
        fileReader.close();
        file2Writer.close();
    }

    private static boolean wordContainsNum(String s) {
        boolean wordHasNum = false;
        char[] sChars = s.toCharArray();
        for (char item: sChars) {
            if (Character.isDigit(item)){
                wordHasNum = true;
                break;
            }
        }
        return wordHasNum;
    }
}
