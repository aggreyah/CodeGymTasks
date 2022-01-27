package com.codegym.task.task16.task1630;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //write your code here
    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    static {
        try {
            firstFileName = bufferedReader.readLine();
            secondFileName = bufferedReader.readLine();
        } catch (IOException e) {
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //write your code here
        f.join();
        System.out.println(f.getFileContents());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContents() ;

        void join() throws InterruptedException;

        void start();
    }

    //write your code here
    public static class ReadFileThread extends Thread implements ReadFileInterface{

        private String fileName;
        private String fileContents = "";
        private BufferedReader reader;

        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        @Override
        public String getFileContents() {
//            Scanner scanner = new Scanner(new FileReader(this.fileName));
//            StringBuilder stringBuilder = new StringBuilder();
//            while (scanner.hasNext()){
//                stringBuilder.append(scanner.next() + " ");
//            }
//            scanner.close();
            return this.fileContents;
        }

        @Override
        public void run() {
            try {
                reader = new BufferedReader(new FileReader(this.fileName));
                String line = reader.readLine();
                while (line != null){
                    this.fileContents += line + " ";
                    line = reader.readLine();
                }
                reader.close();
            } catch (IOException e) {
            }
        }
    }
}
