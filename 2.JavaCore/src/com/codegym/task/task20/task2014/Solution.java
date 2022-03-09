package com.codegym.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution

*/

public class Solution implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println(new Solution(4));
        File task2014File = File.createTempFile("task2014File", ".solution");
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(task2014File));
        ObjectInputStream is = new ObjectInputStream(new FileInputStream(task2014File));
        Solution savedObject = new Solution(13);
        os.writeObject(savedObject);
        os.close();
        Solution loadedObject;
        loadedObject = (Solution) is.readObject();
        is.close();
        System.out.println("same? " + loadedObject.string.equals(savedObject.string));
    }

    transient private final String pattern = "dd MMMM yyyy, EEEE";
    transient private Date currentDate;
    transient private int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
