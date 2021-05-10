package com.codegym.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Ten cats

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //write your code here
        HashMap<String, Cat> map = new HashMap<>();
        map.put("adolf", new Cat("adolf"));
        map.put("fermi", new Cat("fermi"));
        map.put("richard", new Cat("richard"));
        map.put("dirac", new Cat("dirac"));
        map.put("teller", new Cat("teller"));
        map.put("openheimer", new Cat("openheimer"));
        map.put("boson", new Cat("boson"));
        map.put("heisenberg", new Cat("heisenberg"));
        map.put("davison", new Cat("davison"));
        map.put("germer", new Cat("germer"));

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //write your code here
        HashSet<Cat> cats = new HashSet<>();
        cats.addAll(map.values());
        return cats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
