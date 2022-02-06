package com.codegym.task.task18.task1821;

/* 
Symbol frequency

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        byte[] buffer = new byte[fileInputStream.available()];
        fileInputStream.read(buffer);
        fileInputStream.close();

        Map<Byte, Integer> byteAndFrequency = new TreeMap<>();
        for (byte item:buffer) {
            if (byteAndFrequency.containsKey(item))
                byteAndFrequency.replace(item, byteAndFrequency.get(item) + 1);
            else
                byteAndFrequency.put(item, 1);
        }

        for (Map.Entry<Byte, Integer> entry: byteAndFrequency.entrySet()){
            byte entryByte = (byte) entry.getKey();
            System.out.println((char)entryByte + " " + entry.getValue());
        }
    }
}
