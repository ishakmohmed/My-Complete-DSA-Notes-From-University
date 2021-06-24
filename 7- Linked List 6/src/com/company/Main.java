package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("car1");
        cars.add("car2");

        Iterator<String> it = cars.iterator();
        System.out.println(it.next());

        while (it.hasNext())
            System.out.println(it.next());
    }
}
