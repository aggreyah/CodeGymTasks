package com.codegym.task.task22.task2208;

import java.util.HashMap;
import java.util.Map;

/* 
Build a WHERE query

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> myMap = new HashMap<>();
        myMap.put("name", "Johnson");
        myMap.put("country", "United States");
        myMap.put("city", "Los Angeles");
        myMap.put("age", null);
        System.out.println(getQuery(myMap));

    }
    public static String getQuery(Map<String, String> params) {
        StringBuilder builder = new StringBuilder();
        String result = "";
        for (Map.Entry<String, String> entry: params.entrySet()) {
            if (entry.getValue() != null){
                builder.append(entry.getKey() + String.format(" = '%s' and ", entry.getValue()));
            }
        }
        if (builder.length() > 0){
            result = builder.toString().trim();
            int lastAndInd = result.lastIndexOf("and");
            result = result.substring(0, lastAndInd).trim();
        }
        return result;
    }
}
