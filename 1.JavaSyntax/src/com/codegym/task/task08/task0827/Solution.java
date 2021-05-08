package com.codegym.task.task08.task0827;

import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;

/* 
Working with dates

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        HashMap<String, Integer> months = new HashMap<>();
        months.put("JANUARY", 0);
        months.put("FEBRUARY", 1);
        months.put("MARCH", 2);
        months.put("APRIL", 3);
        months.put("MAY", 4);
        months.put("JUNE", 5);
        months.put("JULY", 6);
        months.put("AUGUST", 7);
        months.put("SEPTEMBER", 8);
        months.put("OCTOBER", 9);
        months.put("NOVEMBER", 10);
        months.put("DECEMBER", 11);

        String[] splitDate = date.split(" ");
        int year = Integer.parseInt(splitDate[2]);
        String month = splitDate[0];
        int day = Integer.parseInt(splitDate[1]);
        int monthInt = months.get(month);
        Calendar calendar1 = new GregorianCalendar(year, 0, 1);
        Calendar calendar2 = new GregorianCalendar(year, monthInt, day);
        long daysBetween = ChronoUnit.DAYS.between(calendar1.toInstant(), calendar2.toInstant());

        if (daysBetween % 2 == 0)
            return true;
        else
            return  false;
    }
}
