package com.codegym.task.task20.task2021;

import java.io.*;

/* 
Serialization is prohibited

*/

public class Solution implements Serializable {
    public static class SubSolution extends Solution {
        private void writeObject(ObjectOutputStream oos) throws NotSerializableException {
            throw new NotSerializableException();
        }

        private void readObject(ObjectInputStream ois) throws NotSerializableException {
            throw new NotSerializableException();
        }
    }

    public static void main(String[] args) throws IOException {
        SubSolution ss = new SubSolution();
        File file1 = File.createTempFile("task2021", "sol");
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file1));
            oos.writeObject(ss);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file1));
            SubSolution reconstructedSS = (SubSolution) ois.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
