package com.codegym.task.task12.task1204;

/* 
Whether it's a bird or a lamp

*/

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        //write your code here
        if (o instanceof Cat)
            System.out.println(Solution.Cat.class.getSimpleName());
        else if (o instanceof Dog)
            System.out.println(Solution.Dog.class.getSimpleName());
        if (o instanceof Bird)
            System.out.println(Solution.Bird.class.getSimpleName());
        if (o instanceof Lamp)
            System.out.println(Solution.Lamp.class.getSimpleName());
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
