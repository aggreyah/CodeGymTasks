package com.codegym.task.task09.task0926;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
List of number arrays

*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //write your code here
        ArrayList<int[]> arrays = new ArrayList<>();
        arrays.add(new int[5]);
        arrays.add(new int[2]);
        arrays.add(new int[4]);
        arrays.add(new int[7]);
        arrays.add(new int[0]);
        for (int[] array: arrays){
            for (int i = 0; i < array.length; i++)
                array[i] = i*2;
        }
        return arrays;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
