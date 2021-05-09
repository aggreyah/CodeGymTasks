package com.codegym.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Method in a try-catch

*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> ints = new ArrayList<>();
        while (true){
            try{
                ints.add(Integer.parseInt(reader.readLine()));
            }
            catch (NumberFormatException numberFormatException){
                for (int item : ints)
                    System.out.println(item);
                break;
            }
            catch (IOException ioException){}
        }
    }
}
