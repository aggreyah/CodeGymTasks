package com.codegym.task.task04.task0413;

/* 
Day of the week

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new
                BufferedReader(new InputStreamReader(System.in));
        String sDay = bufferedReader.readLine();
        int day = Integer.parseInt(sDay);

        if ((day > 7) || (day < 1))
            System.out.println("No such day of the week");
        else{
            if (day == 1)
                System.out.println("Monday");
            if (day == 2)
                System.out.println("Tuesday");
            if (day == 3)
                System.out.println("Wednesday");
            if (day == 4)
                System.out.println("Thursday");
            if (day == 5)
                System.out.println("Friday");
            if (day == 6)
                System.out.println("Saturday");
            if (day == 7)
                System.out.println("Sunday");
        }

    }
}