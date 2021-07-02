package com.codegym.task.task14.task1420;

/* 
GCD

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstNumberString = reader.readLine();
        String secondNumberString = reader.readLine();

        Integer firstNumber;
        Integer secondNumber;

        firstNumber = Integer.parseInt(firstNumberString);
        secondNumber = Integer.parseInt(secondNumberString);
        if (firstNumber <= 0 || secondNumber <= 0)
            throw new Exception("one of your numbers is less than 0.");

        System.out.println(gcd(firstNumber, secondNumber));
    }

    private static int gcd(int first, int second) {
        if (first == 0 && second == 0)
            return 0;
        else if (first == 0 && second != 0)
            return second;
        else if (first != 0 && second == 0)
            return first;
        else
            return gcd(second, first % second);
    }
}
