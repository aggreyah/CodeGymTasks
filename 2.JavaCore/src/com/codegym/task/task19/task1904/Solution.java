package com.codegym.task.task19.task1904;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
Yet another adapter

*/

public class Solution {

    public static void main(String[] args) throws IOException, ParseException {
    }

    public static class PersonScannerAdapter implements PersonScanner {

        private final Scanner fileScanner;

        PersonScannerAdapter(Scanner scanner){
            this.fileScanner = scanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            Person person = null;
            if (this.fileScanner.hasNext()){
                String currentLine = this.fileScanner.nextLine();
                String[] currentLineArray = currentLine.split(" ");
                SimpleDateFormat dateFormat = new SimpleDateFormat("MM dd yyyy");
                Date birthDate = dateFormat.parse(currentLineArray[3] + " " +  currentLineArray[4] + " " + currentLineArray[5]);
                person = new Person(currentLineArray[2], currentLineArray[0], currentLineArray[1], birthDate);
            }
            return person;
        }

        @Override
        public void close() throws IOException {
            this.fileScanner.close();
        }
    }
}
