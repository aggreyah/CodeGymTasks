package com.codegym.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Census

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //write your code here
        HashMap<String, String> map = new HashMap<>();
        map.put("Ochieng", "Aggrey");
        map.put("Aligula", "Aggrey");
        map.put("Mutai", "Nicholas");
        map.put("Kithaka", "Nicholas");
        map.put("Ngei", "Charles");
        map.put("Mwangi", "Collins");
        map.put("Anyega", "Charles");
        map.put("Tarus", "Isaac");
        map.put("Labat", "Brian");
        map.put("Adegu", "Boaz");

        return map;
    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {
        //write your code here
        int countSameName = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
            if (pair.getValue().equals(name))
                countSameName ++;
        return countSameName;
    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        //write your code here
        int countSameName = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
            if (pair.getKey().equals(lastName))
                countSameName ++;
        return countSameName;
    }

    public static void main(String[] args) {

    }
}
