package com.codegym.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Introducing properties

*/

public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        // Implement this method
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName);
        load(fileInputStream);
    }

    public void save(OutputStream outputStream) throws Exception {
        // Implement this method
        PrintWriter writer = new PrintWriter(outputStream);
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            writer.println(key + " = " + value);
        }
        writer.close();
    }

    public void load(InputStream inputStream) throws Exception {
        // Implement this method
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        while (reader.ready()){
            String nameValue = reader.readLine();
            if (nameValue.startsWith("!") || nameValue.startsWith("#") || !nameValue.contains(" = "))
                continue;

            if (countBackSapcesAtEnd(nameValue) % 2 != 0 && nameValue.endsWith("\\")){
                nameValue = nameValue.substring(0, nameValue.length() - 1);
                nameValue += reader.readLine().trim();
            }else if (countBackSapcesAtEnd(nameValue) % 2 == 0 && nameValue.endsWith("\\")) {
                nameValue = nameValue.substring(0, nameValue.length() - 1);
            }

            String[] nameAndValue = nameValue.split(" = ");
            String name = nameAndValue[0];
            name = name.replaceAll("\\\\ ", " ");
            name = name.replaceAll("\\\\:", ":");
            name = name.replaceAll("\\\\=", "=");
            String value = nameAndValue[1];
            Solution.properties.put(name, value);
        }
        inputStream.close();
    }

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        solution.fillInPropertiesMap();
        BufferedReader outPutFileNameReader = new BufferedReader(new InputStreamReader(System.in));
        String outPutFile = outPutFileNameReader.readLine();
        outPutFileNameReader.close();
        FileOutputStream fileOutputStream = new FileOutputStream(outPutFile);
        solution.save(fileOutputStream);
    }

    private static int countBackSapcesAtEnd (String s) {
        int backSpaces = 0;
        if (!s.endsWith("\\"))
            return backSpaces;
        else {
            if (s.indexOf("\\") == s.length() - 1){
                backSpaces ++;
                return  backSpaces;
            }else{
                backSpaces ++;
                s = s.substring(s.indexOf("\\") + 1);
                return backSpaces + countBackSapcesAtEnd(s);
            }
        }
    }
}
