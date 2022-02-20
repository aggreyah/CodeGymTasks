package com.codegym.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Searching for the right lines

*/

public class Solution {
    public static List<String> words = new ArrayList<>();

    static {
        words.add("file");
        words.add("view");
        words.add("In");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = fileNameReader.readLine();
        fileNameReader.close();

        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedFileReader = new BufferedReader(fileReader);

        while (bufferedFileReader.ready()){
            int wordsCount = 0;
            String line = bufferedFileReader.readLine();
            for (String word: words) {
                wordsCount += countWord(line, word);
            }
            if (wordsCount == 2)
                System.out.println(line);
        }
        fileReader.close();
        bufferedFileReader.close();
    }

    private static  int countWord (String string, String word) {
        int count = 0;
        if (string.indexOf(word) == -1)
            return count;
        else {
            count ++;
            string = string.substring(string.indexOf(word) + word.length());
            return count + countWord(string, word);
        }
    }
}
