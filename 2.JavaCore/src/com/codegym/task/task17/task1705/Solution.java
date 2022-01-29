package com.codegym.task.task17.task1705;

import java.util.ArrayList;
import java.util.List;

/* 
Time in the garden

*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class Garden {

        public final List<String> fruits = new ArrayList<>();
        public final List<String> vegetables = new ArrayList<>();

        public synchronized void addFruit(int index, String fruit){
            this.fruits.add(index, fruit);
        }

        public synchronized void removeFruit(int index){
            synchronized (this){
                this.fruits.remove(index);
            }
        }

        public synchronized void addVegetable(int index, String vegetable){
            synchronized (this){
                this.vegetables.add(index, vegetable);
            }
        }

        public synchronized void removeVegetable(int index){
            synchronized (this){
                this.vegetables.remove(index);
            }
        }

    }

}
