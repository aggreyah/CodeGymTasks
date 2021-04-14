package com.codegym.task.task05.task0508;

/* 
Getters and setters for the Person class

*/

public class Person {
    //write your code here
    private String name;
    private int age;
    private char sex;

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public static void main(String[] args) {

    }
}
