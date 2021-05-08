package com.codegym.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Software update

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // List of addresses
        HashMap<String, String> cityFamily = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            String family = reader.readLine();
            if (family.isEmpty()) break;
            cityFamily.put(city, family);
        }

        // Read the house number
        String cityToQuery = reader.readLine();

        if (cityFamily.containsKey(cityToQuery)) {
            String familyName = cityFamily.get(cityToQuery);
            System.out.println(familyName);
        }
    }
}
