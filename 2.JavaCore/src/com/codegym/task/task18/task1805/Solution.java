package com.codegym.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Sorting bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);

        List<Integer> readBytes = new ArrayList<>();
        while (inputStream.available() > 0)
            readBytes.add(inputStream.read());

        inputStream.close();

        List<Integer> distinctReadBytes = new ArrayList<>();
        for (Integer readByte : readBytes)
            if (!distinctReadBytes.contains(readByte))
                distinctReadBytes.add(readByte);

        Collections.sort(distinctReadBytes);

        for (int i : distinctReadBytes)
            System.out.print(i + " ");


    }
}
