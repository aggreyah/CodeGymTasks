package com.codegym.task.task19.task1925;

/* 
Long words

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file1 = args[0];
        String file2 = args[1];

        FileReader file1Reader = new FileReader(file1);
        BufferedReader file1BufferedReader = new BufferedReader(file1Reader);
        FileWriter file2Writer =  new FileWriter(file2);

        boolean firstWordMoreThanSixChars = false;

        while (file1BufferedReader.ready()){
            String line = file1BufferedReader.readLine();
            String[] words = line.split(" ");

            for (String word : words) {
                String goodWord = removePunctuationAtEndOfWord(word);
                if (word.equals(goodWord)){//
                    // no punctuation
                    if (word.length() > 6){
                        if (!firstWordMoreThanSixChars){
                            file2Writer.write(word);
                            firstWordMoreThanSixChars = true;
                        }
                        else {
                            file2Writer.write("," + word);
                        }
                    }
                }
                else {
                    // has a punctuation
                    if (goodWord.length() > 6){
                        if (!firstWordMoreThanSixChars){
                            file2Writer.write(goodWord);
                            firstWordMoreThanSixChars = true;
                        }
                        else {
                            file2Writer.write("," + goodWord);
                        }
                    }
                }
            }
        }
        file1Reader.close();
        file1BufferedReader.close();
        file2Writer.close();
    }

    private static String removePunctuationAtEndOfWord(String word) {
        boolean endsWithPunctuation = word.matches(".*\\p{Punct}");
        return endsWithPunctuation ? word.substring(0, word.length() - 1) : word;
    }
}
