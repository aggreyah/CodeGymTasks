package com.codegym.task.task19.task1920;

/* 
The richest

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        FileReader fileReader = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(fileReader);

        Map<String, Double> nameSalaryPair = new TreeMap<>();

        while (reader.ready()){
            String line = reader.readLine();
            String[] nameAndSalary = line.split(" ");
            String name = nameAndSalary[0];
            String salaryString = nameAndSalary[1];
            double salary = Double.parseDouble(salaryString);
            double salaryTwoDecimals = Double.parseDouble(String.format("%.2f", salary));
            if (nameSalaryPair.containsKey(name))
                nameSalaryPair.replace(name, nameSalaryPair.get(name) + salaryTwoDecimals);
            else
                nameSalaryPair.put(name, salaryTwoDecimals);
        }
        reader.close();
        fileReader.close();

        nameSalaryPair = sortedByValue(nameSalaryPair);
        List<String> namesWithMaxSalary = new ArrayList<>();
        Iterator<Double> iterator = nameSalaryPair.values().iterator();
        double maxSalary = iterator.next();

        for (Map.Entry<String, Double> entry: nameSalaryPair.entrySet()) {
            if (entry.getValue() == maxSalary)
                namesWithMaxSalary.add(entry.getKey());
        }
        Collections.sort(namesWithMaxSalary);
        for (String name: namesWithMaxSalary) {
            System.out.println(name);
        }
    }

    private static Map<String, Double> sortedByValue(Map<String, Double> pairs) {
        Map<String, Double> sortedByValue = new LinkedHashMap<>();

        List<Map.Entry<String, Double>> entryList = new ArrayList<>(pairs.entrySet());
        entryList.sort((x, y) -> y.getValue().compareTo(x.getValue()));
        for (Map.Entry<String, Double> entry: entryList ) {
            sortedByValue.put(entry.getKey(), entry.getValue());
        }
        return  sortedByValue;
    }
}
