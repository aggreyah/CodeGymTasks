package com.codegym.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD 2

*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

    public static void main(String[] args) throws ParseException {
        switch (args[0]){
            case "-c":
                synchronized (allPeople){
                    makePeopleAndAddToList(Arrays.copyOfRange(args, 1, args.length));
                }
                break;
            case "-u":
                synchronized (allPeople){
                    updatePeopleWithSpecifiedIds(Arrays.copyOfRange(args, 1, args.length));
                }
                break;
            case "-d":
                synchronized (allPeople){
                    performLogicalDeletion(Arrays.copyOfRange(args, 1, args.length));
                }
                break;
            case "-i":
                synchronized (allPeople){
                    displayInformationOfPeopleWithIds(Arrays.copyOfRange(args, 1, args.length));
                }
                break;
        }
    }

    private static void displayInformationOfPeopleWithIds(String[] strings) {
        for (String id: strings){
            System.out.print(Solution.allPeople.get(Integer.parseInt(id)).getName() + " ");
            String genderSymbol = Solution.allPeople.get(Integer.parseInt(id)).getSex().equals(Sex.FEMALE)? "f" : "m";
            System.out.print(genderSymbol + " ");
            SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);
            String formattedDate = dateFormat.format(Solution.allPeople.get(Integer.parseInt(id)).getBirthDate());
            System.out.println(formattedDate);
        }
    }

    private static void performLogicalDeletion(String[] strings) {
        for (String id: strings){
            Solution.allPeople.get(Integer.parseInt(id)).setName(null);
            Solution.allPeople.get(Integer.parseInt(id)).setSex(null);
            Solution.allPeople.get(Integer.parseInt(id)).setBirthDate(null);
        }
    }

    private static void updatePeopleWithSpecifiedIds(String[] strings) throws ParseException {
        for (int i = 0; i < strings.length; i += 4){
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);
            Date currentDateOfBirth = dateFormat.parse(strings[i + 3]);
            Sex currentGender = strings[i + 2].equals("m")? Sex.MALE : Sex.FEMALE;
            Solution.allPeople.get(Integer.parseInt(strings[i])).setName(strings[i + 1]);
            Solution.allPeople.get(Integer.parseInt(strings[i])).setSex(currentGender);
            Solution.allPeople.get(Integer.parseInt(strings[i])).setBirthDate(currentDateOfBirth);
        }
    }

    private static void makePeopleAndAddToList(String[] argStrings) throws ParseException {
        for (int i = 0; i < argStrings.length; i+=3){
            Sex gender = argStrings[i + 1].equals("m")? Sex.MALE : Sex.FEMALE;
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);
            Date dateOfBirth = dateFormat.parse(argStrings[i + 2]);
            Person currentPerson = gender.equals(Sex.FEMALE)? Person.createFemale(argStrings[i], dateOfBirth)
                    : Person.createMale(argStrings[i], dateOfBirth);
            Solution.allPeople.add(currentPerson);
            System.out.println(Solution.allPeople.indexOf(currentPerson));
        }
    }
}
