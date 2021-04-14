package com.codegym.task.task05.task0527;

/* 
Tom and Jerry

*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        //write your code here
        Dog jerryDog = new Dog("Spooky", "German Shepherd", 3);
        Cat jerryCat = new Cat("Fluffy", "grey", 3);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //write your code here
    public static class Dog{
        private String name;
        private String breed;
        private int age;

        public Dog(String name, String breed, int age) {
            this.name = name;
            this.breed = breed;
            this.age = age;
        }
    }

    public static class Cat{
        private String name;
        private String color;
        private int age;

        public Cat(String name, String color, int age) {
            this.name = name;
            this.color = color;
            this.age = age;
        }
    }
}
