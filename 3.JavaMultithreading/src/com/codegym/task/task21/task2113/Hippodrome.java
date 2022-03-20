package com.codegym.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    static Hippodrome game;

    public Hippodrome(List<Horse> listOfHorses){
        this.horses = listOfHorses;
    }
    
    public static void main(String[] args) throws InterruptedException {
        Horse horse1 = new Horse("Horse1", 3, 0);
        Horse horse2 = new Horse("Horse2", 3, 0);
        Horse horse3 = new Horse("Horse3", 3, 0);

        List<Horse> myHorses = new ArrayList<>();
        myHorses.add(horse1);
        myHorses.add(horse2);
        myHorses.add(horse3);

        game = new Hippodrome(myHorses);

        game.run();
        game.printWinner();
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++){
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move(){
        for (Horse horse: this.getHorses()) {
            horse.move();
        }
    }

    public void print(){
        for (Horse horse: this.getHorses()) {
            horse.print();
        }
        for (int i = 0; i < 10; i++){
            System.out.println();
        }
    }

    public Horse getWinner(){
        double longestDist = 0.0;
        Horse winner = null;
        for (Horse horse: this.getHorses()) {
            if (horse.getDistance() > longestDist){
                longestDist = horse.getDistance();
                winner = horse;
            }
        }
        return winner;
    }

    public void printWinner(){
        System.out.println(String.format("The winner is %s!", this.getWinner().getName()));
    }
}
