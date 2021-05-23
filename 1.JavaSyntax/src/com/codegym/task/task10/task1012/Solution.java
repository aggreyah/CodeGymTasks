package com.codegym.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Number of letters

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Alphabet
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        for (char letter : abcArray) {
            alphabet.add(letter);
        }

        // Read in strings
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        // write your code here
//      map for alphabet item with corresponding value.
        Map<Character, Integer> map = new HashMap<>();
//        populate map initializing key values to zero
        for (Character alphabetItem : alphabet)
            map.put(alphabetItem, 0);
//        change values of map
        for (String item : list)
            for (Character charItem: item.toCharArray())
                if (map.containsKey(charItem))
                    map.replace(charItem, map.get(charItem) + 1);

//        print map
        for (Map.Entry key : map.entrySet())
            System.out.println(key.getKey() + " " + key.getValue());
    }

}
