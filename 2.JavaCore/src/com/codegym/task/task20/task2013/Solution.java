package com.codegym.task.task20.task2013;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Externalizable Person

*/

public class Solution {
    public static class Person implements Externalizable{
        private String firstName;
        private String lastName;
        private int age;
        private Person mother;
        private Person father;
        private List<Person> children;

        public Person(){}

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public void setMother(Person mother) {
            this.mother = mother;
        }

        public void setFather(Person father) {
            this.father = father;
        }

        public void setChildren(List<Person> children) {
            this.children = children;
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(mother);
            out.writeObject(father);
            out.writeObject(firstName);
            out.writeObject(lastName);
            out.writeInt(age);
            out.writeObject(children);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            mother = (Person)in.readObject();
            father = (Person)in.readObject();
            firstName = (String)in.readObject();
            lastName = (String)in.readObject();
            age = in.readInt();
            children = (List)in.readObject();
        }
    }

    public static void main(String[] args) {
        Person aggrey = new Person("Aggrey", "Oluande", 38);
        Person elizabeth = new Person("Elizabeth", "Juma", 65);
        Person william = new Person("William", "Ochieng", 75);
        aggrey.setFather(william);
        aggrey.setMother(elizabeth);

        Person chao = new Person("Elizabeth", "Chao", 7);
        Person marie = new Person("Marie", "Curie", 3);
        Person bohr = new Person("Niels", "Bohr", 1);

        List<Person> aggreyChildren = new ArrayList<>();
        aggreyChildren.add(chao);
        aggreyChildren.add(marie);
        aggreyChildren.add(bohr);

        aggrey.setChildren(aggreyChildren);

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(File.createTempFile("aggreyah", ".ser")));
            os.writeObject(aggrey);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("aggreyah.ser"));
            Person aggreyInflated = (Person) is.readObject();
            is.close();
            for (Person child: aggreyInflated.children) {
                System.out.println(child.firstName + " " + child.lastName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
