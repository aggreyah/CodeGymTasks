package com.codegym.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Functionality is not enough!

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();

        while (true){
            String currentNumString = reader.readLine();
            if (currentNumString.isEmpty())
                break;
            int id = Integer.parseInt(currentNumString);
            String name = reader.readLine();
            if (name.isEmpty()){
                map.put(name,id);
                break;
            }
            map.put(name, id);
        }
        for (Map.Entry<String, Integer> pair : map.entrySet())
            System.out.println(pair.getValue() + " " + pair.getKey());
    }
}
