package com.codegym.task.task19.task1912;

/* 
Reader Wrapper 2

*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream myStream = new PrintStream(byteArrayOutputStream);
        PrintStream consoleStream = System.out;

        System.setOut(myStream);
        testString.printSomething();

        System.setOut(consoleStream);

        String result = byteArrayOutputStream.toString();
        String finalResult = result.replaceAll("te", "??");
        System.out.println(finalResult);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("This is text for testing");
        }
    }
}
