package com.codegym.task.task10.task1013;

/* 
Human class constructors

*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Write your variables and constructors here
        private String firstName;
        private String secondName;
        private String yearOfBirth;
        private String countryOfBirth;
        private String eyeColor;
        private boolean male;

        public Human(){}

        public Human(String name){this.firstName = name;}

        public Human(String first, String second){
            this.firstName = first;
            this.secondName = second;
        }

        public Human(String first, String second, String year){
            this.firstName = first;
            this.secondName = second;
            this.yearOfBirth = year;
        }

        public Human(boolean male, String first, String second){
            this.male = male;
            this.firstName = first;
            this.secondName = second;
        }

        public Human(boolean male, String first, String second, String country){
            this.male = male;
            this.firstName = first;
            this.secondName = second;
            this.countryOfBirth = country;
        }

        public Human(boolean male, String first, String second, String country, String eyes){
            this.male = male;
            this.firstName = first;
            this.secondName = second;
            this.countryOfBirth = country;
            this.eyeColor = eyes;
        }

        public Human(String first, String second, String year, String country){
            this.firstName = first;
            this.secondName = second;
            this.yearOfBirth = year;
            this.countryOfBirth = country;
        }

        public Human(String first, String second, String year, String country, String eyes){
            this.firstName = first;
            this.secondName = second;
            this.yearOfBirth = year;
            this.countryOfBirth = country;
            this.eyeColor = eyes;
        }

        public Human(String first, String second, String year, String country, String eyes, boolean male){
            this.firstName = first;
            this.secondName = second;
            this.yearOfBirth = year;
            this.countryOfBirth = country;
            this.eyeColor = eyes;
            this.male = male;
        }
    }
}
