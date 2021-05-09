package com.codegym.task.task09.task0915;

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

/* 
Catching custom exceptions

*/

public class Solution {
    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args) throws IOException{
        try{
            handleExceptions();
        }
        catch (IOException ioException){BEAN.log(ioException);}
    }

    public static void handleExceptions() throws FileSystemException {
        try{
            BEAN.throwExceptions();
        }
        catch (FileSystemException fileSystemException){
            BEAN.log(fileSystemException);
            throw fileSystemException;
        }
        catch (IOException ioException){
            BEAN.log(ioException);
        }
    }

    public static class StatelessBean {
        public void log(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        public void throwExceptions() throws CharConversionException, FileSystemException, IOException {
            int i = (int) (Math.random() * 3);
            if (i == 0)
                throw new CharConversionException();
            if (i == 1)
                throw new FileSystemException("");
            if (i == 2)
                throw new IOException();
        }
    }
}
