package com.codegym.task.task18.task1808;

/* 
Splitting a file

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();
        reader.close();

        FileInputStream inputStreamFromFile1 = new FileInputStream(file1);
        FileOutputStream outputStreamToFile2 = new FileOutputStream(file2);
        FileOutputStream outputStreamToFile3 = new FileOutputStream(file3);

        if (inputStreamFromFile1.available() > 0){
            byte[] buffer = new byte[inputStreamFromFile1.available()];
            int numBytesInBuffer = inputStreamFromFile1.read(buffer);

            if (numBytesInBuffer % 2 == 0){
                outputStreamToFile2.write(buffer, 0, numBytesInBuffer / 2);
                outputStreamToFile3.write(buffer, numBytesInBuffer / 2, numBytesInBuffer / 2);
            }
            else {
                outputStreamToFile2.write(buffer, 0 , numBytesInBuffer / 2 + 1);
                outputStreamToFile3.write(buffer, numBytesInBuffer / 2 + 1, numBytesInBuffer / 2);
            }
        }
        inputStreamFromFile1.close();
        outputStreamToFile2.close();
        outputStreamToFile3.close();
    }
}
