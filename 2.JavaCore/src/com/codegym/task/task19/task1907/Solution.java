package com.codegym.task.task19.task1907;

/* 
Counting words

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();

        FileReader fileReader = new FileReader(fileName);
        List<Character> characters = new ArrayList<>();

        while (fileReader.ready())
            characters.add((char) fileReader.read());
        fileReader.close();

        StringBuilder builder = new StringBuilder();
        for (char item:characters) {
            builder.append(item);
        }
        String fileContentString = builder.toString();
        fileContentString = fileContentString.replaceAll("\\r\\n|\\r|\\n", " ");
        fileContentString = fileContentString.replaceAll("\\p{P}", " ");
        String [] fileContectNoSpaces = fileContentString.split(" ");

        int numOfTimesWorldExists = 0;
        for (String item:fileContectNoSpaces) {
            if (item.equals("world"))
                numOfTimesWorldExists += 1;
        }
        System.out.println(numOfTimesWorldExists);
    }
}