package com.codegym.task.task14.task1408;

class EuropeanHen extends Hen implements Continent{

    @Override
    int getMonthlyEggCount() {
        return 27;
    }

    @Override
    String getDescription() {
        return String.format("%s" + " I come from %s. I lay %d eggs a month.", super.getDescription(), EUROPE, getMonthlyEggCount());
    }
}
