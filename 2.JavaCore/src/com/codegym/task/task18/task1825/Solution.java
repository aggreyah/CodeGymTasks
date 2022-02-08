package com.codegym.task.task18.task1825;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Pattern;

/* 
Building a file

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> fileNames = new ArrayList<>();
        String currentFile = reader.readLine();
        while (!currentFile.equals("end")){
            fileNames.add(currentFile);
            currentFile = reader.readLine();
        }

        String consolidatingFile = fileNames.get(0).split(Pattern.quote(".part"))[0];

        FileOutputStream consolidatedFileOutPutStream = new FileOutputStream(consolidatingFile);

        List<String> sortedFileNames = new ArrayList<>();
        int index = 1;
        while (index <= fileNames.size()){
            for (String fileName :fileNames) {
                if (fileName.endsWith(""+index))
                    sortedFileNames.add(fileName);
            }
            index++;
        }

        for (String sortedFileName:sortedFileNames) {
            FileInputStream fileInputStream = new FileInputStream(sortedFileName);
            byte[] buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer);
            fileInputStream.close();
            consolidatedFileOutPutStream.write(buffer);
        }
        consolidatedFileOutPutStream.close();
    }
}
