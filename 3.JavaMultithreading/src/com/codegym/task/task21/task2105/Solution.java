package com.codegym.task.task21.task2105;

import java.util.HashSet;
import java.util.Set;

/* 
Fix the bug. Comparing objects

*/

public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Solution))
            return false;
        Solution n = (Solution) o;

        if (this.first != null){
            if (!this.first.equals(n.first))
                return false;
        }
        else {
            if (n.first != null)
                return false;
        }

        if (this.last != null){
            if (!this.last.equals(n.last))
                return false;
        }
        else {
            if (n.last != null)
                return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (this.first == null? 0: this.first.hashCode());
        result = prime * result + (this.last == null? 0: this.last.hashCode());
        return result;
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Mickey", "Mouse"));
        System.out.println(s.contains(new Solution("Mickey", "Mouse")));
    }
}
