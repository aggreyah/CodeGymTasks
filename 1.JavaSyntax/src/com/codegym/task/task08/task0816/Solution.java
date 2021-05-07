package com.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Kind Emma and the summer holidays

*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));

        //write your code here
        map.put("Aggrey", df.parse("DECEMBER 20 1982"));
        map.put("Boniface", df.parse("APRIL 5 1980"));
        map.put("Benard", df.parse("NOVEMBER 1 1980"));
        map.put("Elvis", df.parse("MAY 9 1992"));
        map.put("Night", df.parse("JUNE 1 1994"));
        map.put("Emily", df.parse("AUGUST 1 1989"));
        map.put("Joyce", df.parse("SEPTEMBER 13 1989"));
        map.put("Elizabeth", df.parse("FEBRUARY 27 2015"));
        map.put("Marie", df.parse("DECEMBER 18 2018"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) throws ParseException {
        //write your code here
        SimpleDateFormat startOfSpringSDF = new SimpleDateFormat("MMMMM d");
        SimpleDateFormat endOfSpringSDF = new SimpleDateFormat("MMMMM d");
        Date startOfSpring = startOfSpringSDF.parse("JUNE 1");
        Date endOfSpring = endOfSpringSDF.parse("AUGUST 31");

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, Date> currentPair = iterator.next();
            if (currentPair.getValue().getMonth() >= startOfSpring.getMonth()
                    && currentPair.getValue().getMonth() <= endOfSpring.getMonth())
                iterator.remove();
        }


    }

    public static void main(String[] args) throws ParseException {

    }
}
