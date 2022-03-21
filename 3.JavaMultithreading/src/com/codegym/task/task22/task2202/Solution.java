package com.codegym.task.task22.task2202;

/* 
Find a substring

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("CodeGym is the best place to learn Java."));
        System.out.println(getPartOfString("Amigo and Diego are best friends!"));
//        System.out.println(getPartOfString(null));
        System.out.println(getPartOfString("CodeGym is the best place"));
    }

    public static String getPartOfString(String string) {
        StringBuilder builder = new StringBuilder();
        try {
            int spaceCount = 0;
            int currentStart = string.indexOf(" ") + 1;
            int nextStart;
            while (spaceCount < 4){
                spaceCount ++;
                if (spaceCount == 4 && string.indexOf(" ", currentStart) == -1){
                    builder.append(string.substring(currentStart));
                    continue;
                }
                nextStart = string.indexOf(" ", currentStart);
                builder.append(string, currentStart, nextStart);
                builder.append(" ");
                currentStart = nextStart + 1;
            }
        } catch (Exception e) {
            throw new StringTooShortException();
        }
        return builder.toString().trim();
    }

    public static class StringTooShortException extends RuntimeException{
    }
}
