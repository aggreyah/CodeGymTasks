package com.codegym.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Reinforce the singleton pattern

*/

public class Solution {
    public static void main(String[] args) {
    }

    public static Planet thePlanet;

    // Add static block here
    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        // Implement step #5 here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String valueFromConsole = bufferedReader.readLine();
        if (valueFromConsole.equals(Planet.EARTH)){
            Solution.thePlanet = Earth.getInstance();
        }
        else if (valueFromConsole.equals(Planet.MOON)){
            Solution.thePlanet = Moon.getInstance();
        }
        else if (valueFromConsole.equals(Planet.SUN)){
            Solution.thePlanet = Sun.getInstance();
        }
        else
            Solution.thePlanet = null;
    }
}
