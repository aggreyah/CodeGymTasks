package com.codegym.task.task19.task1906;

/* 
Even characters

*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();
        bufferedReader.close();

        FileReader fileReader1 = new FileReader(file1);
        List<Byte> charBuffer = new ArrayList<>();
        int data = fileReader1.read();
        while (data != -1){
            charBuffer.add((byte) data);
            data = fileReader1.read();
        }
        fileReader1.close();

        FileWriter fileWriter2 = new FileWriter(file2);
        for (int i = 0; i < charBuffer.size(); i++){
            if (i % 2 != 0)
                fileWriter2.write(charBuffer.get(i));
        }
        fileWriter2.close();
    }
}
