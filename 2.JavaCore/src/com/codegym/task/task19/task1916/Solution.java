package com.codegym.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Tracking changes

*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader fileNamesReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = fileNamesReader.readLine();
        String file2 = fileNamesReader.readLine();
        fileNamesReader.close();

        FileReader file1Reader = new FileReader(file1);
        FileReader file2Reader = new FileReader(file2);

        List<Character> file1Chars = new ArrayList<>();
        List<Character> file2Chars = new ArrayList<>();

        while (file1Reader.ready())
            file1Chars.add((char) file1Reader.read());

        while (file2Reader.ready())
            file2Chars.add((char) file2Reader.read());

        file1Reader.close();
        file2Reader.close();

        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();

        for (char item:file1Chars) {
            builder1.append(item);
        }

        for (char item : file2Chars) {
            builder2.append(item);
        }

        String[] file1Lines = builder1.toString().split("\r\n");
        String[] file2Lines = builder2.toString().split("\r\n");
        List<String> file1LinesList = Arrays.asList(file1Lines);
        List<String> file2LinesList = Arrays.asList(file2Lines);

        for (String line : file2LinesList) {
            if (file1LinesList.contains(line)){
                lines.add(new LineItem(Type.SAME, line));
            }
            else {
                lines.add(new LineItem(Type.ADDED, line));
            }
        }

        for (String line : file1LinesList) {
            if (!file2LinesList.contains(line))
                lines.add(new LineItem(Type.REMOVED, line));
        }

        System.out.println(lines);
    }

    public static enum Type {
        ADDED,        // New line added
        REMOVED,      // Line deleted
        SAME          // No change
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }

        @Override
        public String toString() {
            return String.format("%s %s", this.type, this.line);
        }
    }
}
