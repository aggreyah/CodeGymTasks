package com.codegym.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Animal set

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();

        //write your code here
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());

        return result;
    }

    public static Set<Dog> createDogs() {
        //write your code here
        HashSet<Dog> result = new HashSet<>();
        result.add(new Dog());
        result.add(new Dog());
        result.add(new Dog());
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //write your code here
        HashSet<Object> catsAndDogs = new HashSet<>();
        catsAndDogs.addAll(cats);
        catsAndDogs.addAll(dogs);
        return catsAndDogs;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //write your code here
        Iterator<Cat> catsIterator = cats.iterator();
        while (catsIterator.hasNext())
            pets.remove(catsIterator.next());
    }

    public static void printPets(Set<Object> pets) {
        //write your code here
        Iterator<Object> petsIterator = pets.iterator();
        while (petsIterator.hasNext())
            System.out.println(petsIterator.next());
    }

    //write your code here
    public static class Dog{}
    public static class Cat{}
}
