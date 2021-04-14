package com.codegym.task.task05.task0520;

/* 
Create a Rectangle class

*/


public class Rectangle {
    //write your code here
    private int top, left, width, height;

    public Rectangle(int top, int left, int width, int height){
        this.top = top;
         this.left = left;
         this.width = width;
         this.height = height;
    }

    public Rectangle(int top, int left){
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = this.width;
    }

    public Rectangle(Rectangle otherRectangle){
        this.top = otherRectangle.top;
        this.left = otherRectangle.left;
        this.width = otherRectangle.width;
        this.height = otherRectangle.height;
    }

    public static void main(String[] args) {

    }
}
