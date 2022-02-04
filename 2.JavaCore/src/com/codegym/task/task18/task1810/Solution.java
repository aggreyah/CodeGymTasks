package com.codegym.task.task18.task1810;

/* 
DownloadException

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String fileName = reader.readLine();
            FileInputStream inputStreamFromFile = new FileInputStream(fileName);

            if (inputStreamFromFile.available() >= 1000){
                inputStreamFromFile.read(new byte[inputStreamFromFile.available()]);
            }
            else {
                inputStreamFromFile.close();
                throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}
