package com.codegym.task.task15.task1518;

/* 
Static modifiers and kittens

*/

public class Solution {
    public static Cat cat;

    static {
        Cat c = new Cat();
        c.name = "Schroedinger";
        cat =c;
        System.out.println(cat.name);
    }

    public static class Cat{
        public String name;
    }

    public static void main(String[] args) {

    }
}
