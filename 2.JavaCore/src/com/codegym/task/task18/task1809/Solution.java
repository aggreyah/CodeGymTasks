package com.codegym.task.task18.task1809;

/* 
Reversing a file

*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileOutputStream outputStreamToFile2 = new FileOutputStream(file2);
        FileInputStream inputStreamFromFile1 = new FileInputStream(file1);

        if (inputStreamFromFile1.available() > 0){
            byte[] buffer = new byte[inputStreamFromFile1.available()];
            inputStreamFromFile1.read(buffer);

            List<Byte> bufferAsList = new ArrayList<>();
            for (byte item: buffer)
                bufferAsList.add(item);
            Collections.reverse(bufferAsList);
            for (int i = 0; i < bufferAsList.size(); i++)
                buffer[i] = bufferAsList.get(i);

            outputStreamToFile2.write(buffer);
        }
        inputStreamFromFile1.close();
        outputStreamToFile2.close();
    }
}
