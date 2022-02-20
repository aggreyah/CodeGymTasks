package com.codegym.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Replacing numbers

*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "zero");
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");
        map.put(11, "eleven");
        map.put(12, "twelve");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = fileNameReader.readLine();
        fileNameReader.close();

        FileReader fileReader = new FileReader(fileName);
        BufferedReader fileBufferedReader = new BufferedReader(fileReader);

        while (fileBufferedReader.ready()){
            String line = fileBufferedReader.readLine();
            String[] words = line.split(" ");
            for (int i = 0; i < words.length; i++){
                String useful;
                String toBePrinted = null;
                useful = getUsefulString(words[i]);

                if (checkWordIsNum(useful)){
                    // it is a number
                    boolean betweenZeroAndTwelve = Integer.parseInt(useful) >= 0 && Integer.parseInt(useful) <= 12;
                    if (useful.equals(words[i])){
                        //no punctuation
                        if (betweenZeroAndTwelve)
                            toBePrinted = map.get(Integer.parseInt(useful));
                        else
                            toBePrinted = useful;
                    }
                    else{
                        //there's punctuation
                        if (betweenZeroAndTwelve)
                            toBePrinted = map.get(Integer.parseInt(useful)) + words[i].substring(words[i].length() - 1);
                        else
                            toBePrinted = words[i];
                    }

                }else {
                    // not a number
                    toBePrinted = words[i];
                }

                if (i < words.length - 1){
                    System.out.print(toBePrinted + " ");
                }
                else {
                    System.out.println(toBePrinted);
                }
            }
        }
        fileBufferedReader.close();
        fileReader.close();
    }

    private static String getUsefulString(String s) {
        boolean endsWithPunctuation = s.matches(".*\\p{Punct}");
        return endsWithPunctuation ? s.substring(0, s.length() - 1) : s;
    }

    private static  boolean checkWordIsNum (String s){
        boolean isAnum = false;
        try {
            Integer.parseInt(s);
            isAnum = true;
        } catch (NumberFormatException e) {
        }
        return  isAnum;
    }
}
