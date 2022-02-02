package com.codegym.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Most frequent bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);

        List<Integer> readBytes = new ArrayList<>();
        Map<Integer, Integer> bytesWithFrequency = new HashMap<Integer, Integer>();

        while (inputStream.available() > 0)
            readBytes.add(inputStream.read());

        inputStream.close();
        reader.close();

        for (Integer readByte: readBytes){
            if (!bytesWithFrequency.containsKey(readByte))
                bytesWithFrequency.put(readByte, 1);
            else
                bytesWithFrequency.replace(readByte, bytesWithFrequency.get(readByte) + 1);
        }

        int maxFrequency = 0;

        for (Integer i : bytesWithFrequency.keySet()){
            if (maxFrequency < bytesWithFrequency.get(i))
                maxFrequency = bytesWithFrequency.get(i);
        }

        List<Integer> bytesWithMaxFrequency = new ArrayList<>();
        for (Integer i : bytesWithFrequency.keySet())
            if (bytesWithFrequency.get(i) == maxFrequency)
                bytesWithMaxFrequency.add(i);

        for(int i : bytesWithMaxFrequency)
            System.out.print(i + " ");
    }
}
