package com.codegym.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Static modifiers: part 1

*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<>();

    static {
        labels.put(1.0, "James Clerk Maxwell");
        labels.put(1.1, "Isaac Newton");
        labels.put(1.2, "Galileo Galilei");
        labels.put(1.3, "Johannes Kepler");
        labels.put(1.4, "Nicolaus Copernicus");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
