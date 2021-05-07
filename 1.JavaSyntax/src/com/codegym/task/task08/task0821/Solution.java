package com.codegym.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Shared last names and first names

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //write your code here
        HashMap<String, String> map = new HashMap<>();
        map.put("Ochieng", "Aggrey");
        map.put("Ochieng", "Eric");
        map.put("Aligula", "Aggrey");
        map.put("Oluande", "Niels");
        map.put("Oluande", "Marie");
        map.put("Kibicho", "Clive");
        map.put("Kevore", "Francis");
        map.put("Imathiu", "Boniface");
        map.put("Maingi", "George");
        map.put("Mwolobi", "George");

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
