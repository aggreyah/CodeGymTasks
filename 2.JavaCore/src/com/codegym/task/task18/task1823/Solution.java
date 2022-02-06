package com.codegym.task.task18.task1823;

import java.io.*;
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
            currentThread.start();
            currentFile = bufferedReader.readLine();
        }
    }

    public static class ReadThread extends Thread {
        String fileName;
        public ReadThread(String fileName) {
            // Implement constructor body
            this.fileName = fileName;
        }
        // Implement file reading here
        @Override
        public void run() {
            try {
                FileInputStream fileInputStream = new FileInputStream(fileName);
                byte[] buffer = new byte[fileInputStream.available()];
                fileInputStream.read(buffer);
                fileInputStream.close();

                Map<Byte, Integer> threadMap = new HashMap<>();
                for(byte item: buffer){
                    if (threadMap.containsKey(item))
                        threadMap.replace(item, threadMap.get(item) + 1);
                    else
                        threadMap.put(item, 1);
                }
                int max = 0;
                for (Map.Entry<Byte, Integer> entry:threadMap.entrySet())
                    if (entry.getValue() > max)
                        max = entry.getValue();

                int mostFrequentKey = 0;
                for (Map.Entry<Byte, Integer> entry: threadMap.entrySet())
                    if (entry.getValue() == max)
                        mostFrequentKey = entry.getKey();

                synchronized (resultMap){
                    resultMap.put(this.fileName, mostFrequentKey);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
