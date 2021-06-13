package com.codegym.task.task13.task1326;

/* 
Sorting even numbers from a file

*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
        Scanner scanner = new Scanner(fileInputStream);

        ArrayList<Integer> evenIntsFromFile = new ArrayList<>();
        while (scanner.hasNext()){
            Integer value = Integer.parseInt(scanner.nextLine());
            if (value % 2 == 0)
                evenIntsFromFile.add(value);
        }
        scanner.close();
        fileInputStream.close();

        Collections.sort(evenIntsFromFile);
        for (Integer item : evenIntsFromFile)
            System.out.println(item);
    }
}
