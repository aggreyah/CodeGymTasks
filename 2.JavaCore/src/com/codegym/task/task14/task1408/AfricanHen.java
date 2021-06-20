package com.codegym.task.task14.task1408;

public class AfricanHen extends Hen implements Continent{

    @Override
    int getMonthlyEggCount() {
        return 30;
    }

    @Override
    String getDescription() {
        return String.format("%s" + " I come from %s. I lay %d eggs a month.", super.getDescription(), AFRICA, getMonthlyEggCount());
    }
}
