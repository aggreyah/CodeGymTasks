package com.codegym.task.task10.task1015;

import java.util.ArrayList;

/* 
Array of string lists

*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //write your code here
        ArrayList<String>[] myList = new ArrayList[2];
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list1.add("the");
        list1.add("quick");
        list1.add("brown");
        list1.add("fox");

        list2.add("jumped");
        list2.add("over");
        list2.add("the");
        list2.add("lazy");
        list2.add("dogs");

        myList[0] = list1;
        myList[1] = list2;

        return myList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}