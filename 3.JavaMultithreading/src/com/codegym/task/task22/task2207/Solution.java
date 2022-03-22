package com.codegym.task.task22.task2207;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* 
Inverted words

*/

public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader fileContent = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

        List<String> linesBuffer = new ArrayList<>();
        String line = fileContent.readLine();
        while (line != null){
            linesBuffer.add(line);
            line = fileContent.readLine();
        }
        fileContent.close();
        StringBuilder builder = new StringBuilder();
        getWordAndMirrorPairs(linesBuffer, builder);

        for (Pair pair: result) {
            System.out.println(String.format("%s %s", pair.first, pair.second));
        }
    }

    private static void getWordAndMirrorPairs(List<String> b, StringBuilder build) {
        String theWholeThing = "";
        for (int i = 0; i < b.size(); i++) {
            if (i < b.size() - 1)
                theWholeThing += b.get(i) + " ";
            else
                theWholeThing += b.get(i);
        }

        List<String> allWords = new ArrayList<>(Arrays.asList(theWholeThing.split(" ")));

        while (!allWords.isEmpty()){
            String currentWord = allWords.remove(0);
            build.setLength(0);

            build.append(currentWord);
            String currentWordMirror = build.reverse().toString();
            if (allWords.indexOf(currentWordMirror) != -1){
                Pair currentPair = new Pair();
                currentPair.first = currentWord;
                currentPair.second = currentWordMirror;
                result.add(currentPair);
                allWords.remove(currentWordMirror);
            }
        }
    }

    public static class Pair {
        String first;
        String second;

        public Pair(){}

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;
        }
    }

}
