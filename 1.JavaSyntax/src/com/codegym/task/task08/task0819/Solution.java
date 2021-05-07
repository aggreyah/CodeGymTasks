package com.codegym.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set of cats

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //write your code here. step 3
        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext()){
            Cat firstCat = iterator.next();
            boolean removed = cats.remove(firstCat);
            if (removed)
                break;
        }

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //write your code here. step 2
        HashSet<Cat> catsSet = new HashSet<>();

        catsSet.add(new Cat());
        catsSet.add(new Cat());
        catsSet.add(new Cat());

        return catsSet;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4
        Iterator<Cat> iterator = cats.iterator();

        while (iterator.hasNext())
            System.out.println(iterator.next());
    }

    // step 1
    public static class Cat{

        public Cat(){
        }
    }
}
