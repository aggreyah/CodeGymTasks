package com.codegym.task.task20.task2017;

import java.io.*;

/* 
Deserialization

*/

public class Solution {
    public A getOriginalObject(ObjectInputStream objectStream) {
        try {
            A recoveredA = (A) objectStream.readObject();
            return recoveredA;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) throws IOException {
//        A a = new A();
//        File fileName = File.createTempFile("task2017", ".a");
//        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName));
//        os.writeObject(a);
//        os.close();
//
//        ObjectInputStream is = new ObjectInputStream(new FileInputStream(fileName));
//        A recoveredA = Solution.getOriginalObject(is);
//        is.close();
//        System.out.println(recoveredA);
    }
}
