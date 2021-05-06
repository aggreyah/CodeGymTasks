package com.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Longest sequence

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> ints = new ArrayList<>();
        for (int i = 0; i < 10; i++) ints.add(Integer.parseInt(reader.readLine()));

        int currentMaxRepeats = Integer.MIN_VALUE;
        int nextIndex;

        for (int i = 0; i < ints.size() - 1;){
            nextIndex = i + 1;
            if (nextIndex > ints.size() - 1)
                break;
            int tempMaxRepeats = 1;
            while (ints.get(i).equals(ints.get(nextIndex))){
                tempMaxRepeats ++;
                nextIndex ++;
                if (nextIndex > ints.size() - 1)
                    break;
            }
            i = nextIndex;
            if (tempMaxRepeats > currentMaxRepeats) currentMaxRepeats = tempMaxRepeats;
        }
        System.out.println(currentMaxRepeats);
    }
}
