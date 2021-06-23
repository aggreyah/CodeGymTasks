package com.codegym.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, loser, coder and programmer

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        // Here's the loop for reading the keys. Item 1
        while (true)
        {
            String currentKey = reader.readLine();
            if (currentKey.equals("user") || currentKey.equals("loser")
                    || currentKey.equals("coder") || currentKey.equals("programmer")) {
                // Create an object. Item 2
                if (currentKey.equals("user"))
                    person = new Person.User();
                else if (currentKey.equals("loser"))
                    person = new Person.Loser();
                else if (currentKey.equals("coder"))
                    person = new Person.Coder();
                else
                    person = new Person.Programmer();

                doWork(person); // Call doWork
            }
            else
                break;
        }
    }

    public static void doWork(Person person) {
        // Item 3
        if (person instanceof Person.User)
            ((Person.User) person).live();
        else if (person instanceof Person.Loser)
            ((Person.Loser) person).doNothing();
        else if (person instanceof Person.Coder)
            ((Person.Coder) person).writeCode();
        else if (person instanceof Person.Programmer)
            ((Person.Programmer) person).enjoy();
    }
}
