package com.codegym.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
John Johnson

*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while (bufferedReader.ready()){
            String line = bufferedReader.readLine();
            String[] lineElements = line.split(" ");
            String name = "";
            int year = Integer.parseInt(lineElements[lineElements.length - 1]);
            int day = Integer.parseInt(lineElements[lineElements.length - 2]);
            int month = Integer.parseInt(lineElements[lineElements.length - 3]) - 1;
            Calendar calendar = new GregorianCalendar(year, month, day);
            Date dateOfBirth = calendar.getTime();
            for (int i = 0; i < lineElements.length - 3; i++){
                if (i == lineElements.length - 4)
                    name += lineElements[i];
                else
                    name += lineElements[i] + " ";
            }
            Person person = new Person(name, dateOfBirth);
            PEOPLE.add(person);
        }

        fileReader.close();
        bufferedReader.close();

        for (Person person: PEOPLE) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(person.getBirthDate());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM");
            int month = Integer.parseInt(simpleDateFormat.format(person.getBirthDate()));
            System.out.println(person.getName() + " " + month + " " + calendar.get(Calendar.DAY_OF_MONTH) + " " + calendar.get(Calendar.YEAR));
        }
    }
}
