package com.codegym.task.task14.task1408;

/* 
Chicken factory

*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Continent.ASIA);
        hen.getMonthlyEggCount();
        System.out.println(hen.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String continent) {
            Hen hen = null;
            //write your code here
            if (continent.equals(AfricanHen.AFRICA))
                hen = new AfricanHen();
            else if (continent.equals(AsianHen.ASIA))
                hen = new AsianHen();
            else if (continent.equals(EuropeanHen.EUROPE))
                hen = new EuropeanHen();
            else if (continent.equals(NorthAmericanHen.NORTHAMERICA))
                hen = new NorthAmericanHen();
            return hen;
        }
    }
}
