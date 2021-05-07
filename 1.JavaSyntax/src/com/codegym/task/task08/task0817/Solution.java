package com.codegym.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
We don't need repeats

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //write your code here
        HashMap<String, String> map = new HashMap<>();
        map.put("Oluande", "Aggrey");
        map.put("Aligula", "Aggrey");
        map.put("Onyango", "Elvis");
        map.put("Oduor", "Benard");
        map.put("Achieng", "Lilian");
        map.put("Otieno", "Aggrey");
        map.put("Owino", "Gilian");
        map.put("Bohr", "Niels");
        map.put("Atieno", "Night");
        map.put("Akinyi", "Emily");

        return map;
    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        //write your code here
       HashMap<String, String> tempMap = new HashMap<>(map);
       Iterator<Map.Entry<String, String>> iterator = tempMap.entrySet().iterator();
       while (iterator.hasNext()){
           Map.Entry<String, String> currentPair = iterator.next();
           if (isValueAppearingMoreThanOnce(map, currentPair.getValue()))
               removeItemFromMapByValue(map, currentPair.getValue());
       }

    }

    private static boolean isValueAppearingMoreThanOnce(Map<String, String> map, String value) {
        int numOfTimesValueSeen = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> currentPair = iterator.next();
            if (currentPair.getValue().equals(value))
                numOfTimesValueSeen ++;
        }
        if (numOfTimesValueSeen > 1)
            return true;
        else
            return false;
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
