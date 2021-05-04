package com.codegym.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Changing functionality

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        for (String item: list) {
            if (item.length() % 2 == 0){
                System.out.print(item + " ");
                System.out.println(item);
            }
            else {
                System.out.print(item + " ");
                System.out.print(item+ " ");
                System.out.println(item);
            }
        }
    }
}
