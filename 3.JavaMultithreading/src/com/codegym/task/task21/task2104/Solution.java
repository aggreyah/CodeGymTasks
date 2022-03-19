package com.codegym.task.task21.task2104;

import java.util.HashSet;
import java.util.Set;

/* 
Equals and HashCode

*/

public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object n) {
        if (this == n)
            return true;
        if (!(n instanceof Solution))
            return false;

        Solution other = (Solution) n;

        if (this.first != null){
            if (!this.first.equals(other.first))
                return false;
        }
        else{
            if (other.first != null)
                return false;
        }

        if (this.last != null){
            if (!this.last.equals(other.last))
                return false;
        }
        else{
            if (other.last != null)
                return false;
        }

        return true;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((first == null) ? 0 : first.hashCode());
        result = prime * result + ((last == null) ? 0 : last.hashCode());
        return result;
//        return prime * first.hashCode() + last.hashCode();
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));
    }
}
