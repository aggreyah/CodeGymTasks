package com.codegym.task.task07.task0724;

/* 
Family census

*/

public class Solution {
    public static void main(String[] args) {
        // write your code here
        Human humanOne = new Human("Herrina", false, 80);
        Human humanTwo = new Human("Samwel", true, 90);
        Human humanThree = new Human("Nyar Oduma", false, 75);
        Human humanFour = new Human("Jeckton", true, 95);

        Human humanFive = new Human("Luoma", true, 70, humanFour, humanThree);
        Human humanSix = new Human("Auma", false, 61, humanFour, humanThree);
        Human humanSeven = new Human("William", true, 71, humanTwo, humanOne);
        Human humanEight = new Human("Peninah", false, 76, humanTwo, humanOne);
        Human humanNine = new Human("Akumu", true, 66, humanTwo, humanOne);

        System.out.println(humanOne);
        System.out.println(humanTwo);
        System.out.println(humanThree);
        System.out.println(humanFour);
        System.out.println(humanFive);
        System.out.println(humanSix);
        System.out.println(humanSeven);
        System.out.println(humanEight);
        System.out.println(humanNine);
    }

    public static class Human {
        // write your code here
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null)
                text += ", father: " + this.father.name;

            if (this.mother != null)
                text += ", mother: " + this.mother.name;

            return text;
        }

    }
}