package com.codegym.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Different methods for different types

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String userInput = "";

        while (!userInput.equals("exit")){
            System.out.print("Enter a string value or exit to quit:");
            userInput = bufferedReader.readLine();
            if (userInput.equals("exit"))
                break;
            if (isDouble(userInput))
                print(Double.parseDouble(userInput));
            else if (isShort(userInput))
                print(Short.parseShort(userInput));
            else if (isInteger(userInput))
                print(Integer.parseInt(userInput));
            else
                print(userInput);
        }
    }

    public static boolean isDouble(String s){
        boolean isADouble = true;
        try {
            Double.parseDouble(s);
            if (!s.contains("."))
                isADouble = false;
        } catch (NumberFormatException e) {
            isADouble = false;
        }
        return isADouble;
    }

    public static boolean isShort(String s){
        boolean isAShort = true;
        try {
            Integer myInt = Integer.parseInt(s);
            if (!(myInt > 0 && myInt < 128)){
                isAShort = false;
            }
        } catch (NumberFormatException e) {
            isAShort = false;
        }
        return isAShort;
    }

    public static boolean isInteger(String s){
        boolean isAnInteger = true;
        try {
            Integer myInt = Integer.parseInt(s);
            if (!(myInt <= 0 || myInt >= 128))
                isAnInteger = false;
        } catch (NumberFormatException e) {
            isAnInteger = false;
        }
        return isAnInteger;
    }

    public static void print(Double value) {
        System.out.println("This is a Double. Value: " + value);
    }

    public static void print(String value) {
        System.out.println("This is a String. Value: " + value);
    }

    public static void print(short value) {
        System.out.println("This is a short. Value: " + value);
    }

    public static void print(Integer value) {
        System.out.println("This is an Integer. Value: " + value);
    }
}
