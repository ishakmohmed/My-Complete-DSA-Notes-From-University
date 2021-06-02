package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        people.put("Person1", 68);
        people.put("Person2", 69);

        for (var i : people.keySet())
            System.out.println("Name: " + i + ", Age: " + people.get(i));
    }
}
