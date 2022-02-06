package com.codegym.task.task18.task1822;

/* 
Finding data inside a file

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        String id = args[0];

        String line = fileReader.readLine();
        while (line != null){
            if (line.startsWith(id + " ")){
                System.out.println(line);
                break;
            }
            line = fileReader.readLine();
        }
        fileReader.close();
    }
}
