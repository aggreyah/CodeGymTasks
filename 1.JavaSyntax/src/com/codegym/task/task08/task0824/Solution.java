package com.codegym.task.task08.task0824;

/* 
Make a family

*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Human grandFatherOne = new Human();
        Human grandFatherTwo = new Human();
        Human grandMotherOne = new Human();
        Human grandMotherTwo = new Human();
        Human father = new Human();
        Human mother = new Human();
        Human son = new Human();
        Human daughterOne = new Human();
        Human daughterTwo = new Human();

        grandFatherOne.name = "Okoth";
        grandFatherOne.children.add(father);
        grandFatherOne.sex = true;
        grandFatherOne.age = 90;

        grandFatherTwo.name = "Ochuodho";
        grandFatherTwo.children.add(mother);
        grandFatherTwo.sex = true;
        grandFatherTwo.age = 92;

        grandMotherOne.name = "Nyumba";
        grandMotherOne.children.add(father);
        grandMotherOne.sex = false;
        grandMotherOne.age = 70;

        grandMotherTwo.name = "Plister";
        grandMotherTwo.children.add(mother);
        grandMotherTwo.sex = false;
        grandMotherTwo.age = 72;

        father.name = "Ochieng";
        father.age = 71;
        father.sex = true;
        father.children.add(son);
        father.children.add(daughterOne);
        father.children.add(daughterTwo);

        mother.name = "Juma";
        mother.age = 56;
        mother.sex = false;
        mother.children.add(son);
        mother.children.add(daughterOne);
        mother.children.add(daughterTwo);

        son.name = "Aggrey";
        son.age = 38;
        son.sex = true;

        daughterOne.name = "Lilian";
        daughterOne.sex = false;
        daughterOne.age = 33;

        daughterTwo.name = "Maurine";
        daughterTwo.sex = false;
        daughterTwo.age = 31;

        System.out.println(grandFatherOne);
        System.out.println(grandFatherTwo);
        System.out.println(grandMotherOne);
        System.out.println(grandMotherTwo);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(daughterOne);
        System.out.println(daughterTwo);
    }

    public static class Human {
        //write your code here
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
