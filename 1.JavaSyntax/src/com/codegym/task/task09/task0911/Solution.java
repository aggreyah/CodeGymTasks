package com.codegym.task.task09.task0911;

import java.util.HashMap;

/* 
Exception when working with Map collections

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        try{
            HashMap<String, String> map = new HashMap<>(null);
            map.put(null, null);
            map.remove(null);
        }
        //write your code here
        catch (NullPointerException nullPointerException){
            System.out.println(nullPointerException);
        }
    }
}
