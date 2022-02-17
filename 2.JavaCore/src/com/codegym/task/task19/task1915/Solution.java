package com.codegym.task.task19.task1915;

/* 
Duplicate text

*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream myStream = new PrintStream(byteArrayOutputStream);
        PrintStream consoleStream = System.out;
        System.setOut(myStream);

        testString.printSomething();
        System.setOut(consoleStream);

        System.out.println(byteArrayOutputStream);

        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        fileOutputStream.write(byteArrayOutputStream.toByteArray());
        fileOutputStream.close();
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("This is text for testing");
        }
    }
}

