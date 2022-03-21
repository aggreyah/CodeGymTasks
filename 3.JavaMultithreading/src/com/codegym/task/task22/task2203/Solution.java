package com.codegym.task.task22.task2203;

/* 
Between tabs

*/

public class Solution {
    public static String getPartOfString(String string) throws StringTooShortException {
        String result;
        try {
            int start = string.indexOf("\t");
            int stop = string.indexOf("\t", start + 1);
            result = string.substring(start + 1, stop);
        } catch (Exception e) {
            throw new StringTooShortException();
        }
        return result;
    }

    public static class StringTooShortException extends Exception {
    }

    public static void main(String[] args) throws StringTooShortException {
        System.out.println(getPartOfString("\tCodeGym is the best place \tto learn Java\t."));
        System.out.println(getPartOfString("CodeGym is the best place \tto learn Java.\t"));
    }
}
