package com.codegym.task.task14.task1419;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Exception invasion

*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   // The first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //write your code here
        try{
            int i = Integer.parseInt("");
        } catch (Exception e){
            exceptions.add(e);
        }

        try {
            new InputStreamReader(new FileInputStream("hell.txt"));
        } catch (FileNotFoundException fileNotFoundException) {
            exceptions.add(fileNotFoundException);
        }

        try {
            int[] ints = new int[2];
            System.out.println(ints[2]);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] ints = new int[-2];
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object x = Integer.valueOf(0);
            System.out.println((String)x);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object x = null;
            System.out.println(x.toString());
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Character c = "hell".charAt(5);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object x[] = new String[3];
            x[0] = Integer.valueOf(0);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Set<Integer> ints = new HashSet<>();
            Collections.addAll(ints, 1, 4, 7);
            Set<Integer> intsFixed = Collections.unmodifiableSet(ints);
            intsFixed.add(7);
        } catch (Exception e) {
            exceptions.add(e);
        }

    }
}
