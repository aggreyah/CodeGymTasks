package com.codegym.task.task18.task1812;

import java.io.*;

/* 
Extending AmigoOutputStream

*/

public class QuestionFileOutputStream implements AmigoOutputStream {

    private AmigoOutputStream amigoOutputStream;

    public QuestionFileOutputStream(AmigoOutputStream amigoOutputStream){
        this.amigoOutputStream = amigoOutputStream;
    }

    @Override
    public void flush() throws IOException {
        this.amigoOutputStream.flush();
    }

    @Override
    public void write(int b) throws IOException {
        this.amigoOutputStream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        this.amigoOutputStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        this.amigoOutputStream.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Do you really want to close the stream? Y/N");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String shouldStreamClose = reader.readLine();
        if (shouldStreamClose.equals("Y"))
            this.amigoOutputStream.close();
        reader.close();
    }
}

