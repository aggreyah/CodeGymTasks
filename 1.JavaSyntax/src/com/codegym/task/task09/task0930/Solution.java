package com.codegym.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // write your code here
        ArrayList<String> stringPart = new ArrayList<>();
        ArrayList<Integer> intPart = new ArrayList<>();
        for (String item : array)
            try{
                intPart.add(Integer.parseInt(item));
            }
            catch (NumberFormatException numberFormatException){
                stringPart.add(item);
            }
//      sorting the string part. selection sort.
        for (int i = 0; i < stringPart.size() - 1; i ++)
            for (int j = i + 1; j < stringPart.size(); j ++)
                if (isGreaterThan(stringPart.get(i), stringPart.get(j))){
                    String temp = stringPart.get(i);
                    stringPart.set(i, stringPart.get(j));
                    stringPart.set(j, temp);
                }
//      sorting the number part.
        Collections.sort(intPart, Collections.reverseOrder());
        Iterator<String> stringsIterator = stringPart.iterator();
        Iterator<Integer> intsIterator = intPart.iterator();

        for (int i = 0; i < array.length; i ++){
            if (isNumber(array[i]))
                array[i] = intsIterator.next().toString();
            else
                array[i] = stringsIterator.next();
        }
    }

    // String comparison method: 'a' is greater than 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Is the passed string a number?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // The string contains a hyphen
                    || (!Character.isDigit(c) && c != '-') // or is not a number and doesn't start with a hyphen
                    || (i == 0 && c == '-' && chars.length == 1)) // or is a single hyphen
            {
                return false;
            }
        }
        return true;
    }
}
