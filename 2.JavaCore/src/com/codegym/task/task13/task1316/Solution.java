package com.codegym.task.task13.task1316;

/* 
Incorrect lines

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(SimpleObject.NAME);
        System.out.println(Button.NAME);
    }

    interface SimpleObject {
        String NAME = "SimpleObject";

        void onPress();
    }

    interface Button extends SimpleObject {

        final String NAME = "Submit";

//        public void onPress();
//
//        void onPress();
//
//        void onPress();
//
//        private void onPress();
//
        String onPress(Object o);
//
//        String onPress(Object o);
//
//        private String onPress(Object o);

    }
}