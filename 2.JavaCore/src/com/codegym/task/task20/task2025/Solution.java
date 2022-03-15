package com.codegym.task.task20.task2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Number algorithms

*/

public class Solution {

    public static long[] getNumbers(long N) {
        long[] result = null;
        List<Long> resultList = new ArrayList<>();
        N = N - 1;
        while (N > 10){
            if (sumDigitsRaisedToNumDigits(N))
                resultList.add(N);
            N = N - 1;
        }
        Collections.sort(resultList);
        result = new long[resultList.size()];
        for (int i = 0; i < result.length; i ++) {
            result[i] = resultList.get(i);
        }
        return result;
    }

    private static int countDigits(long n) {
        int count = 0;
        if (n != 0){
            count ++;
            return count + countDigits(n / 10);
        }
        else
            return count;
    }

    private static boolean sumDigitsRaisedToNumDigits(long n) {
        int digitCount = countDigits(n);
        int[] digitsArray = getDigits(n);
        long result = 0;
        for (int digit : digitsArray) {
            result += Math.pow(digit, digitCount);
        }
        return n == result;
    }

    private static int[] getDigits(long n) {
        String nString = Long.toString(n);
        int [] result = new int[nString.length()];
        for (int i = 0; i < nString.length(); i++) {
            result[i] = Character.getNumericValue(nString.charAt(i));
        }
        return result;
    }

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);

        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000000000)));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);
    }
}
