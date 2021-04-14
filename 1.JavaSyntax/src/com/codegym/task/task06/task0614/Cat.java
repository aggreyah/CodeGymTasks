package com.codegym.task.task06.task0614;

import java.util.ArrayList;

/* 
Static cats

*/

public class Cat {
    //write your code here
    public static ArrayList<Cat> cats = new ArrayList<Cat>();

    public Cat() {
    }

    public static void main(String[] args) {
        //write your code here
        Cat cat0 = new Cat();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();
        Cat cat8 = new Cat();
        Cat cat9 = new Cat();

        Cat.cats.add(cat0);
        Cat.cats.add(cat1);
        Cat.cats.add(cat2);
        Cat.cats.add(cat3);
        Cat.cats.add(cat4);
        Cat.cats.add(cat5);
        Cat.cats.add(cat6);
        Cat.cats.add(cat7);
        Cat.cats.add(cat8);
        Cat.cats.add(cat9);

        printCats();
    }

    public static void printCats() {
        //write your code here
        for (Cat cat : Cat.cats){
            System.out.println(cat);
        }
    }
}
