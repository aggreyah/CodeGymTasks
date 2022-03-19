package com.codegym.task.task21.task2107;

import java.util.LinkedHashMap;
import java.util.Map;

/* 
Deep cloning of a map

*/

public class Solution implements Cloneable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Solution solution = new Solution();
        solution.users.putAll(this.users);
        return solution;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        Solution clone = null;
        try {
            clone = (Solution) solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }


    }

    protected Map<String, User> users = new LinkedHashMap();

    public static class User implements Cloneable{
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        protected Object clone() {
            User user = new User(this.age, this.name);
            return user;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + (this.name == null? 0 : this.name.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (!(obj instanceof User))
                return false;
            User user = (User) obj;
            if (this.name != null){
                if (!this.name.equals(user.name))
                    return false;
            }
            else{
                if (user.name != null)
                    return false;
            }

            return true;
        }
    }
}
