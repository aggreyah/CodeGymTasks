package com.codegym.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD

*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

    public static void main(String[] args) throws ParseException {
        // Start here
        if (args[0].equals("-c"))
            addPersonWithSpecifiedArguments(args[1], args[2], args[3]);
        if (args[0].equals("-u"))
            updateThePersonDataWithSpecifiedId(args[1], args[2], args[3], args[4]);
        if (args[0].equals("-d"))
            performLogicalDeleteOfPersonWithSpecifiedId(args[1]);
        if (args[0].equals("-i"))
            displayInfoAboutPersonWithSpecifiedId(args[1]);
    }

    private static void displayInfoAboutPersonWithSpecifiedId(String id) {
        Person thePerson = Solution.allPeople.get(Integer.parseInt(id));
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);
        String dob = dateFormat.format(thePerson.getBirthDate());
        String symbolForGender = thePerson.getSex().equals(Sex.MALE) ? "m": "f";
        System.out.println(thePerson.getName() + " " + symbolForGender + " " + dob);
    }

    private static void performLogicalDeleteOfPersonWithSpecifiedId(String id) {
        Solution.allPeople.get(Integer.parseInt(id)).setBirthDate(null);
        Solution.allPeople.get(Integer.parseInt(id)).setName(null);
        Solution.allPeople.get(Integer.parseInt(id)).setSex(null);
    }

    private static void updateThePersonDataWithSpecifiedId(String id, String name, String sex, String dob) throws ParseException {
        Solution.allPeople.get(Integer.parseInt(id)).setName(name);
        Sex gender = sex.equals("m") ? Sex.MALE:Sex.FEMALE;
        Solution.allPeople.get(Integer.parseInt(id)).setSex(gender);
        SimpleDateFormat dateFormatter = new SimpleDateFormat("MM dd yyyy");
        Date dateOfBirth = dateFormatter.parse(dob);
        Solution.allPeople.get(Integer.parseInt(id)).setBirthDate(dateOfBirth);
    }

    private static void addPersonWithSpecifiedArguments(String name, String sex, String dob) throws ParseException {
        Sex gender = sex.equals("m") ? Sex.MALE : Sex.FEMALE;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd yyyy");
        Date dateOfBirth = simpleDateFormat.parse(dob);
        Person thePerson = gender.equals(Sex.FEMALE) ? Person.createFemale(name, dateOfBirth) :
                Person.createMale(name, dateOfBirth);
        Solution.allPeople.add(thePerson);
        System.out.println(Solution.allPeople.indexOf(thePerson));
    }
}
