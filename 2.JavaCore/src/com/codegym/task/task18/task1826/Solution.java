package com.codegym.task.task18.task1826;

/* 
Encryption

*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        boolean doIencrypt = args[0].equals("-e")? true : false;
        String fileToWorkOn = args[1];
        String encryptedOrDecryptedFile = args[2];

        FileInputStream fileToWorkOnStream = new FileInputStream(fileToWorkOn);
        byte[] buffer = new byte[fileToWorkOnStream.available()];
        fileToWorkOnStream.read(buffer);
        fileToWorkOnStream.close();

        FileOutputStream fileOutputStream = new FileOutputStream(encryptedOrDecryptedFile);
        for (byte item:buffer) {
            if (doIencrypt){
                if (item >= 97 && item <= 122)
                    fileOutputStream.write((((item - 97) + 23) % 26) + 97);
                else if (item >= 65 && item <= 90)
                    fileOutputStream.write((((item - 65) + 23) % 26) + 65);
                else
                    fileOutputStream.write(item);
            }
            else{
                if (item >= 97 && item <= 122)
                    fileOutputStream.write((((item - 97) + 3) % 26) + 97);
                else if (item >= 65 && item <= 90)
                    fileOutputStream.write((((item - 65) + 3) % 26) + 65);
                else
                    fileOutputStream.write(item);
            }
        }
        fileOutputStream.close();
    }
}
