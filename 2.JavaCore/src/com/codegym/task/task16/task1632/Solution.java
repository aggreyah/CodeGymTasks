package com.codegym.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }

    public static void main(String[] args) throws InterruptedException {
        Thread4 thread4 = new Thread4();
        thread4.start();
        Thread.sleep(3000);
        thread4.showWarning();
    }

    public static class Thread1 extends Thread{
        @Override
        public void run() {
            while (true){}
        }
    }

    public static class Thread2 extends Thread{
        @Override
        public void run() {
            if (Thread.currentThread().isInterrupted())
                System.out.println("InterruptedException");
        }
    }

    public static class Thread3 extends Thread{
        @Override
        public void run() {
            try {
                while (true){
                    System.out.println("Hurray");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }
    }

    public static class Thread4 extends Thread implements Message{

        @Override
        public void showWarning() {
            if (Thread.currentThread().isAlive()){
                this.interrupt();
            }
        }

        @Override
        public void run() {
            while (true){
                if (Thread.currentThread().isInterrupted())
                    return;
            }
        }
    }

    public static class Thread5 extends Thread {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        @Override
        public void run() {
            try {
                String input = bufferedReader.readLine();
                int sum = 0;
                while (!input.equals("N")){
                    sum += Integer.parseInt(input);
                    input = bufferedReader.readLine();
                }
                System.out.println(sum);
            } catch (IOException e) {
            }
        }
    }
}