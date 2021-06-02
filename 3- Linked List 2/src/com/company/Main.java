package com.company;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("Malaysia", "KL");
        capitalCities.put("India", "New Delhi");
        capitalCities.put("USA", "WDC");

        System.out.println("Capital cities: " + capitalCities);
        System.out.println("Size of capital cities: " + capitalCities.size());

        System.out.println(capitalCities.get("Malaysia"));

        capitalCities.remove("Malaysia");
        System.out.println("Capital cities after removing Malaysia: " + capitalCities);

        System.out.println("Size of capital cities now: " + capitalCities.size());

        for (var i : capitalCities.values())
            System.out.println(i);

        for (var i : capitalCities.keySet())
            System.out.println("Key: " + i + " value: " + capitalCities.get(i));
    }
}
