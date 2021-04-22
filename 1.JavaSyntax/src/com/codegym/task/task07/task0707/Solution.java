package com.codegym.task.task07.task0707;

import java.util.ArrayList;

/* 
What sort of list is that?

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("my");
        stringList.add("name");
        stringList.add("is");
        stringList.add("aggrey");
        stringList.add("ochieng");
        System.out.println(stringList.size());
        for(String item: stringList)
            System.out.println(item);
    }
}
