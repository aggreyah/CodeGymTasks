package com.codegym.task.task07.task0716;

import java.util.ArrayList;

/* 
R or L

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rose"); // 0
        list.add("lyre"); // 1
        list.add("love"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        // write your code here
        ArrayList<String> tempList = new ArrayList<>();
        tempList.addAll(list);
        for (String item : list){
            if (item.contains("r") && !item.contains("l"))
                tempList.remove(item);
            else if (!item.contains("r") && item.contains("l"))
                tempList.add(item);
        }
        return tempList;
    }
}