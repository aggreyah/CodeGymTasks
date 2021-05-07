package com.codegym.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Only for the rich

*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //write your code here
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ochieng", 1200);
        map.put("Bohr", 400);
        map.put("Curie", 20000);
        map.put("Chao", 25000);
        map.put("Onyango", 26000);
        map.put("Oduor", 30000);
        map.put("Oluande", 1000000);
        map.put("Hector", 100);
        map.put("Brian", 200);
        map.put("Shelter", 50);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //write your code here
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> currentPair = iterator.next();
            if (currentPair.getValue().intValue() < 500)
                iterator.remove();
        }
    }

    public static void main(String[] args) {

    }
}