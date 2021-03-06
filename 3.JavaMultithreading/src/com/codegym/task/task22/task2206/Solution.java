package com.codegym.task.task22.task2206;

import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Date formatting

*/

public class Solution {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(String.format(getFormattedString(), date, date, date, date, date, date));
        // The output should be something like this
        // 10:31:13 15:59:59
    }

    public static String getFormattedString() {
        return "%1$tm:%2$td:%3$ty %4$tH:%5$tM:%6$tS";
    }
}
