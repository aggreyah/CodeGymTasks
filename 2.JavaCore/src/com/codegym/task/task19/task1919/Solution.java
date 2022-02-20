package com.codegym.task.task19.task1919;

/* 
Calculating salaries

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];

        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        Map<String, Double> nameDouble = new TreeMap<>();

        while (bufferedReader.ready()){
            String line = bufferedReader.readLine();
            String name = line.split(" ")[0];
            double value = Double.parseDouble(line.split(" ")[1]);
            if (nameDouble.containsKey(name))
                nameDouble.replace(name, nameDouble.get(name) + value);
            else
                nameDouble.put(name, value);
        }

        for (Map.Entry<String, Double> entry: nameDouble.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
