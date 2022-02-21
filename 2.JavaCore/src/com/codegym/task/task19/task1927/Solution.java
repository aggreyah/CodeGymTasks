package com.codegym.task.task19.task1927;

/* 
Contextual advertising

*/

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream myPrintStream = new PrintStream(byteArrayOutputStream);
        PrintStream consoleStream = System.out;

        System.setOut(myPrintStream);
        testString.printSomething();
        System.setOut(consoleStream);

        int count = 0;
        String adText = "CodeGym - online Java courses";
        StringBuilder builder = new StringBuilder();
        for (byte item: byteArrayOutputStream.toByteArray()) {
            builder.append((char) item);
        }

        String fromDivertedConsole = builder.toString();
        fromDivertedConsole = fromDivertedConsole.replaceAll("[\\r\\n]+", " ");
        String[] words = fromDivertedConsole.split(" ");
        List<String> wordsList = new ArrayList<>(Arrays.asList(words));

        while (!wordsList.isEmpty()){
            if (count == 2){
                System.out.println(adText);
                count = 0;
            }
            else {
                count ++;
                System.out.println(wordsList.remove(0));
            }
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
