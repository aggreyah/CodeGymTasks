package com.codegym.task.task19.task1918;

/* 
Introducing tags

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        FileReader fileReader = new FileReader(fileName);
        List<Character> charBuffer = new ArrayList<>();
        while (fileReader.ready())
            charBuffer.add((char) fileReader.read());
        fileReader.close();

        String tagName = args[0];

        StringBuilder builder = new StringBuilder();
        for (char item:charBuffer) {
            builder.append(item);
        }
        String fileString = builder.toString();
        fileString = fileString.substring(fileString.indexOf('<'));
        fileString = fileString.trim();

        while (!fileString.isEmpty()){
            String currentTags = getTagsAndClosings(fileString, tagName);
            printAllTags(currentTags, tagName);
            fileString = fileString.substring(fileString.indexOf(currentTags) + currentTags.length());
        }
    }

    static String getTagsAndClosings (String string, String tag){
        String openingTag = "<" + tag;
        String closingTag = "</" + tag + ">";
        String retString = string.substring(string.indexOf(openingTag), string.indexOf(closingTag));
        string = string.substring(string.indexOf(closingTag));
        int numOpenTags = countOccurrences(retString, openingTag);
        int numCloseTags = 0;

        while (numCloseTags < numOpenTags){
            if (string.substring(0, string.indexOf(closingTag)).isEmpty()){
                retString += closingTag;
                string = string.substring(string.indexOf(closingTag) + closingTag.length());
            }
            else{
                retString += string.substring(0, string.indexOf(closingTag));
                string = string.substring(string.indexOf(closingTag));
            }
            numCloseTags = countOccurrences(retString, closingTag);
        }
        return retString;
    }

    static void printAllTags(String string, String tag){
        int count;
        String openTag = "<" + tag;
        String closeTag = "</" + tag + ">";
        if (string.indexOf(openTag) == -1)
            return;
        while (true){
            count = countOccurrences(string, openTag);
            System.out.println(string);
            if (count == 1){
                break;
            }else{
                string = string.substring(string.indexOf(openTag) + openTag.length());
                StringBuilder builder = new StringBuilder(string);
                String reversed = builder.reverse().toString();
                String closeTagReversed = new StringBuilder(closeTag).reverse().toString();
                reversed = reversed.substring(reversed.indexOf(closeTagReversed) + closeTagReversed.length());
                reversed = reversed.substring(reversed.indexOf(closeTagReversed));
                string = new StringBuilder(reversed).reverse().toString();
                string = string.substring(string.indexOf(openTag));
            }
        }
    }

    static int countOccurrences(String string, String subString){
        int count = 0;
        if (string.indexOf(subString) == -1){
            return count;
        }
        else {
            count ++;
            string = string.substring(string.indexOf(subString) + subString.length());
            return count + countOccurrences(string, subString);
        }
    }
}
