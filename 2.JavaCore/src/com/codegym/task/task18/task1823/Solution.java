package com.codegym.task.task18.task1823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Threads and bytes

*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String currentFile = bufferedReader.readLine();
        while (!currentFile.equals("exit")){
            ReadThread currentThread = new ReadThread(currentFile);
        }

    }

    public static class ReadThread extends Thread {
        public ReadThread(String fileName) {
            // Implement constructor body
        }
        // Implement file reading here
    }
}
