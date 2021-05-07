package com.codegym.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;


/* 
Greater than 10? You're not a good fit for us

*/

public class Solution {
    public static HashSet<Integer> createSet() {
        // write your code here
        HashSet<Integer> ints = new HashSet<>();
        ints.add(170);
        ints.add(56);
        ints.add(54);
        ints.add(14);
        ints.add(67);
        ints.add(17);
        ints.add(19);
        ints.add(16);
        ints.add(1);
        ints.add(3);
        ints.add(5);
        ints.add(6);
        ints.add(7);
        ints.add(8);
        ints.add(9);
        ints.add(10);
        ints.add(11);
        ints.add(21);
        ints.add(35);
        ints.add(89);

        return ints;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        // write your code here
        HashSet<Integer> tempSet = new HashSet<>();
        tempSet.addAll(set);
        for (Integer item : tempSet)
            if (item > 10)
                set.remove(item);
        return set;
    }

    public static void main(String[] args) {

    }
}
