package com.codegym.task.task14.task1421;

/* 
Singleton

*/

public class Solution {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton s1 = Singleton.getInstance();
        System.out.println(s);
        System.out.println(s1);
    }
}
