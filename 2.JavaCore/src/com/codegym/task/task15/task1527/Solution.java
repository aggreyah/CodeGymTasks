package com.codegym.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Request parser

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String url = bufferedReader.readLine();
        String sectionWithParams;
        sectionWithParams = url.split("\\?")[1];
        String[] paramsKeyValues = sectionWithParams.split("&");

        System.out.print(paramsKeyValues[0].split("=")[0]);
        for (int i = 1; i < paramsKeyValues.length; i++){
            System.out.print(" " + paramsKeyValues[i].split("=")[0]);
        }
        System.out.println();

        for (String item : paramsKeyValues){
            if (item.contains("obj")){
                try {
                    alert(Double.parseDouble(item.split("=")[1]));
                } catch (NumberFormatException e) {
                    alert(item.split("=")[1]);
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
