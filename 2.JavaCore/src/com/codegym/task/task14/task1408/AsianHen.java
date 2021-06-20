package com.codegym.task.task14.task1408;

class AsianHen extends Hen implements Continent{

    @Override
    int getMonthlyEggCount() {
        return 25;
    }

    @Override
    String getDescription() {
        return String.format("%s" + " I come from %s. I lay %d eggs a month.", super.getDescription(), ASIA, getMonthlyEggCount());
    }
}
