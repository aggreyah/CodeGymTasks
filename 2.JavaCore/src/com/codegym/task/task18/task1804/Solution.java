package com.codegym.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Rarest bytes

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

        int minFrequency = 260;

        for (Integer i : bytesWithFrequency.keySet()){
            if (minFrequency > bytesWithFrequency.get(i))
                minFrequency = bytesWithFrequency.get(i);
        }

        List<Integer> bytesWithMinFrequency = new ArrayList<>();
        for (Integer i : bytesWithFrequency.keySet())
            if (bytesWithFrequency.get(i) == minFrequency)
                bytesWithMinFrequency.add(i);

        for(int i : bytesWithMinFrequency)
            System.out.print(i + " ");
    }
}
