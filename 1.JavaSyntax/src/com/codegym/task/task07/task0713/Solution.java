package com.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Playing Javarella

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<Integer> mainList = new ArrayList<Integer>();
        ArrayList<Integer> listDivisibleByThree = new ArrayList<Integer>();
        ArrayList<Integer> listDivisibleByTwo = new ArrayList<Integer>();
        ArrayList<Integer> othersList = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) mainList.add(Integer.parseInt(reader.readLine()));

        for (int j = 0; j < mainList.size(); j++){
            if (mainList.get(j) % 3 == 0) listDivisibleByThree.add(mainList.get(j));
            if (mainList.get(j) % 2 == 0) listDivisibleByTwo.add(mainList.get(j));
            if (!listDivisibleByThree.contains(mainList.get(j)) && !listDivisibleByTwo.contains(mainList.get(j)))
                othersList.add(mainList.get(j));
        }

        printList(listDivisibleByThree);
        printList(listDivisibleByTwo);
        printList(othersList);
    }

    public static void printList(List<Integer> list) {
        //write your code here
        for (Integer item : list) System.out.println(item);
    }
}
