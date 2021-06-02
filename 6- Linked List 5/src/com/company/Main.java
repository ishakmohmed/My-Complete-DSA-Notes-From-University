package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<Integer>();

        numbers.add(1);
        numbers.add(2);

        for (var i = 0; i <= 10; i++)
            if (numbers.contains(i))
                System.out.println(i + " is in the set");
            else
                System.out.println(i + " is not in the set");
    }
}
