package com.codegym.task.task19.task1911;

/* 
Reader wrapper

*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        PrintStream consoleStream = System.out;

        System.setOut(stream);
        testString.printSomething();

        String result = outputStream.toString();
        String resultUpperCase = result.toUpperCase();

        System.setOut(consoleStream);
        System.out.println(resultUpperCase);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("This is text for testing");
        }
    }
}
