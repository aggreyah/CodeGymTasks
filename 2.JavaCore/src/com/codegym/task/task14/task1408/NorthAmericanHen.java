package com.codegym.task.task14.task1408;

class NorthAmericanHen extends Hen implements Continent{

    @Override
    int getMonthlyEggCount() {
        return 20;
    }

    @Override
    String getDescription() {
        return String.format("%s" + " I come from %s. I lay %d eggs a month.", super.getDescription(), NORTHAMERICA, getMonthlyEggCount());
    }
}
