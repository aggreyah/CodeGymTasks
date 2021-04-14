package com.codegym.task.task05.task0502;

/* 
Implement the fight method

*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //write your code here
        if (this.strength > anotherCat.strength)
            return true;
        else{
            if (this.strength == anotherCat.strength)
                if (this.weight >= anotherCat.weight)
                    return true;
                else if (this.weight < anotherCat.weight)
                    return false;
                else if (this.age <= anotherCat.age)
                    return true;
                else
                    return false;
            else
                return false;
        }
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.age = 2;
        cat1.weight = 5;
        cat1.strength = 10;
        Cat cat2 = new Cat();
        cat2.age = 3;
        cat2.weight = 3;
        cat2.strength = 8;
        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
    }
}
