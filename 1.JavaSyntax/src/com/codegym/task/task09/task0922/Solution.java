package com.codegym.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
What's today's date?

*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //write your code here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat simpleDateFormatZero = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormatZero.parse(reader.readLine());
        SimpleDateFormat simpleDateFormatOne = new SimpleDateFormat("MMM dd, YYYY");
        String[] string = simpleDateFormatOne.format(date).split(" ");
        System.out.println(string[0].toUpperCase()+ " " + string[1] + " " + string[2]);
    }
}
