package com.codegym.task.task18.task1827;

/* 
Prices

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        if (!(args.length == 0)){
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String currentLine = bufferedReader.readLine();
            int maxId = 0, currentId;
            String currentIdString;
            String productName;
            String price;
            String quantity;
            while (!(currentLine == null)){
                if (Integer.parseInt(currentLine.split(" +")[0]) > maxId)
                    maxId = Integer.parseInt(currentLine.split(" +")[0]);
                currentLine = bufferedReader.readLine();
            }
            bufferedReader.close();
            currentId = maxId + 1;
            if (String.format("%d", currentId).length() < 8){
//                currentIdString = String.format("%d", currentId) + " ".repeat(8 - String.format("%d", currentId).length());
                currentIdString = String.format("%" + (-8) + "s", currentId);
            }else
                currentIdString = String.format("%d", currentId);

            if (args[1].length() < 30){
//                productName = args[1] + " ".repeat(30 - args[1].length());
                productName = String.format("%" + (-30) + "s", args[1]);
            }
            else
                productName = args[1];


            if (args[2].length() < 8){
//                price = args[2] + " ".repeat(8 - args[2].length());
                price = String.format("%" + (-8) + "s", args[2]);
            }
            else
                price = args[2];


            if (args[3].length() < 4){
//                quantity = args[3] + " ".repeat(4 - args[3].length());
                quantity = String.format("%" + (-4) + "s", args[3]);
            }
            else
                quantity = args[3];

            fileOutputStream.write((currentIdString + " " + productName + " " + price + " " + quantity).getBytes());

        }else
            fileOutputStream.close();

    }
}
