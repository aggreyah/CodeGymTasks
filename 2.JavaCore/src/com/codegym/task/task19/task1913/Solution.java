package com.codegym.task.task19.task1913;

/* 
Output only digits

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

        StringBuilder builder = new StringBuilder();
        for (byte item : byteArrayOutputStream.toByteArray()) {
            if (item >= 48 && item <= 57)
                builder.append((char) item);
        }
        System.out.println(builder);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("This 1 text 23 is 4 f5-6or7 tes8ting");
        }
    }
}
