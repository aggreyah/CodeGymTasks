package com.codegym.task.task19.task1914;

/* 
Problem solving

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

        String read = byteArrayOutputStream.toString();
        String[] numsOperatorArray = read.split(" ");
        int firstOperand = Integer.parseInt(numsOperatorArray[0]);
        int secondOperand = Integer.parseInt(numsOperatorArray[2]);
        int answer = 0;

        switch (numsOperatorArray[1]){
            case "+":
            {
                answer = firstOperand + secondOperand;
                break;
            }
            case "-":
            {
                answer = firstOperand - secondOperand;
                break;
            }
            case "*":
            {
                answer = firstOperand * secondOperand;
                break;
            }
        }
        System.out.println(String.format("%d %s %d = %d", firstOperand, numsOperatorArray[1], secondOperand, answer));
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

