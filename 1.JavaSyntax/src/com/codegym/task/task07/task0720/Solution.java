package com.codegym.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Shuffled just in time

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());

        ArrayList<String> nStrings = new ArrayList<>();

        for(int i = 0; i < N; i++) nStrings.add(reader.readLine());

        for (int j = 0;j < M; j++) {
            nStrings.add(nStrings.remove(0));
        }
        for (String item : nStrings) System.out.println(item);
    }
}
